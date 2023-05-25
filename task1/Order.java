package com.camunda.training.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    private Client client;
    private Product product;
    private int qnt;

    private int price;

    public Order(Client client, Product product, int qnt) {
        this.client = client;
        this.product = product;
        this.qnt = qnt;
    }

    public Order() {

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
        calculatePrice();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void calculatePrice() {
        setPrice(product.getPrice() * qnt);
    }
}
