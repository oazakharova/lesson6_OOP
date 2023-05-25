package com.camunda.training.task2;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<ReportItem> items; // Отчетные данные
    private ReportPrinter printer;

    public Report(ReportPrinter printer) {
        this.printer = printer;
    }

    // расчет отчетных данных
    public void calculate() {
        items = new ArrayList<>();
        items.add(new ReportItem("First", (float) 5));
        items.add(new ReportItem("Second", (float) 6));
    }

    public void print() {
        printer.print(items);
    }
}
