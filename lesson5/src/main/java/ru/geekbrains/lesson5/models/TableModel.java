package ru.geekbrains.lesson5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import ru.geekbrains.lesson5.presenters.Model;

public class TableModel implements Model {

    private Collection<Table> tables;

    /**
     * Получить список всех столиков в ресторане
     * @return список столиков
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;

    }

    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return  reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }


    /**
     * TO DO: Необходимо разработать самостоятельно в рамках домашней работы.
     * Отмена старой брони по номеру. Резервирование столика на новую дату и время.
     * @param oldReservationNo
     * @param reservationDate
     * @param tableNo
     * @param Name
     * @return
     */
    public int changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String name){
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                if (reservation.getId() == oldReservationNo){
                    table.getReservations().remove(reservation);
                    table.getReservations().add(reservation);
                    return reservation.getId();           
                }
            }
        }
        throw new RuntimeException("Некорректный номер столика.");  
    }
}
