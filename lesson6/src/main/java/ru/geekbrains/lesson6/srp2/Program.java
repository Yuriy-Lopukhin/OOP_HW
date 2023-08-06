package ru.geekbrains.lesson6.srp2;

public class Program {

    /**
     * TO DO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        order.inputFromConsole();
        order.saveToJson();
    }
}
