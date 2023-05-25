package com.camunda.training.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OrderSaver {

    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClient().getName() + "\",\n");
            writer.write("\"product\":\""+order.getProduct().getTitle()+"\",\n");
            writer.write("\"qnt\":"+order.getQnt()+",\n");
            writer.write("\"total price\":"+order.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private OrderSaver() {}
}
