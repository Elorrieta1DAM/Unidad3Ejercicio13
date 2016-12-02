/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio13;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class Unidad3Ejercicio13 {

    public static Scanner tc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bis;
        int temp, mes, sumatemp = 0, tempmax = -20, tempmin = 40, diaMin, diaMax;
        System.out.println("Introduce el año");
        int año = tc.nextInt();

        do {
            System.out.println("Introduce el mes");
            mes = tc.nextInt();
        } while (mes < 0 || mes > 12);

        numDiasMes(mes, año);

        for (int i = 1; i < numDiasMes(mes, año); i++) {
            temp = leerTemperatura();
            sumatemp = sumatemp + temp;

            if (tempmin > leerTemperatura()) {
                tempmin = leerTemperatura();
                diaMin = i;
            }
            if (tempmax < leerTemperatura()) {
                tempmax = leerTemperatura();
                diaMax = i;
            }
        }
    }

    public static boolean esBisiesto(int a) {
        boolean bisiesto = false;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            bisiesto = true;
        }
        return bisiesto;
    }

    public static int numDiasMes(int m, int a) {
        int numDias = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if (esBisiesto(a) == true) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                ;
                break;
        }
        return numDias;
    }

    public static String nombreMes(int m) {
        String nombreMes;
        switch (m) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Error, introduce un mes valido";
                break;
        }
        return nombreMes;

    }

    public static int leerTemperatura() {
        System.out.println("Introduce una temperatura");
        int t = tc.nextInt();
        while (t < -20 || t > 40) {
            System.out.println("Introduce una temperatura correcta");
            t = tc.nextInt();
        }
        return t;
    }

    public static double celsiusFarenheit(int t) {
        double f = 1.8 * t + 32;
        return f;
    }
}
