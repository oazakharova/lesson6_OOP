package com.camunda.training.task2;

public class App {

    public static void main(String[] args) {
        Report report = new Report(new ConsoleReportPrinter());
        report.calculate();
        report.print();
    }
}
