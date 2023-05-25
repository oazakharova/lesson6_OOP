package com.camunda.training.task2;

import java.util.List;

public class ConsoleReportPrinter implements ReportPrinter {
   @Override
    public void print(List<ReportItem> items) {
        System.out.println("Output to printer");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
