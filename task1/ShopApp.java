package com.camunda.training.task1;

import java.util.Scanner;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("Введите заказ:");

        Order order = new Order();
        inputFromConsole(order);
        OrderSaver.saveToJson(order);
    }

    private static  String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private static void inputFromConsole(Order order) {
        String clientName = prompt("Client name: ");
        String productTitle = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Product quantity: "));
        int productPrice = Integer.parseInt(prompt("Product price: "));
        order.setClient(new Client(clientName));
        order.setProduct(new Product(productTitle, productPrice));
        order.setQnt(qnt);
    }
}
