package com.vinothmasilamani;

public class Main {

    public static void main(String[] args) {

        Toner toner = new Toner(100);
        Printer printer = new Printer(toner, 0, true);

        printer.print(10);

        printer.print(200);

        printer.Refilltoner();

        printer.print(200);
    }
}
