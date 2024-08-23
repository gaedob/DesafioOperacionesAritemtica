package com.inforcap.main;

import java.util.Scanner;

public class Resistencia {

    static Scanner sc = new Scanner(System.in);
    static double res1;
    static double res2;
    static double res3;
    static double resnesima;
    static double restotal;

    private static void printLnMsg(String msg) {
        System.out.println(msg);
    }

    private static void printMsg(String msg) {
        System.out.print(msg);
    }

    private static void resistenc1Do() {
        do {
            printMsg("Ingrese el valor de resistencia 1: ");
            res1 = sc.nextDouble();
            if (res1 < 1) {
                printLnMsg("Valor erroneo. Intente nuevamente");
            }
        } while (res1 <= 0);
    }

    private static void resistenc2Do() {
        do {
            printMsg("Ingrese el valor de resistencia 2: ");
            res2 = sc.nextDouble();
            if (res2 < 1) {
                printLnMsg("Valor erroneo. Intente nuevamente");
            }
        } while (res2 <= 0);
    }

    private static void resistenc3Do() {
        do {
            printMsg("Ingrese el valor de resistencia 3: ");
            res3 = sc.nextDouble();
            if (res3 < 1) {
                printLnMsg("Valor erroneo. Intente nuevamente");
            }
        } while (res3 <= 0);
    }

    public static void main(String[] args) {

        printLnMsg("Calculador de resistencia total V2.0");
        printLnMsg("Ingrese solo valores positivos");

        resistenc1Do();
        resistenc2Do();
        resistenc3Do();

        resnesima = 1 / (1 - 0);
        restotal = (1 / (1 / res1) + (1 / res2) + (1 / res3) + (1 / resnesima));
        System.out.printf("El valor de la resistencia total es : %.1f", restotal);

    }
}
