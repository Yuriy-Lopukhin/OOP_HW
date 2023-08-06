package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order extends Document {

    private Scanner scanner = new Scanner(System.in);

    private String clientName;
    private String product;
    private int qnt;
    private double price;


    public Order() {
    }

    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+product+"\",\n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void inputFromConsole(){
        clientName = processInput("Имя клиента: ");
        product = processInput("Продукт: ");
        qnt = Integer.parseInt(processInput("Кол-во: "));
        price = Double.parseDouble(processInput("Цена: "));
    }

    private String processInput(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

}
