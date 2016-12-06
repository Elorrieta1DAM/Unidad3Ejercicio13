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
  
    }
  /**
     *
     * @param a
     * @return
     */
    public static boolean esBisiesto(int a) {
        boolean bis = false;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            bis = true;
        }
        return bis;
    }

    public static int numDiasMes(int m, int a) {
        int numdias = 0;
        while (m >= 1 && m <= 12) {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numdias = 31;
                    return numdias;
                case 4:
                case 6:
                case 9:
                case 11:
                    numdias = 30;
                    return numdias;
                case 2:
                    if (esBisiesto(a) == true) {
                        numdias = 29;
                        return numdias;
                    } else {
                        numdias = 28;
                        return numdias;
                    }
            }
        }
        return numdias;
    }

    /**
     * Convierte de numero a caracteres
     *
     * @param m
     * @return
     */
    public static String nombreMes(int m) {
        String mes;
        switch (m) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Mes no valido";
                break;
        }
        return mes;
    }

    /**
     *
     * @return
     */
    public static double leerTemperatura() {
        System.out.print("Instroduce una temperatura entre -22 y 40 ªC: ");
        double t = tc.nextInt();
        while (t < -22 || t > 40) {
            System.out.print("Instroduce una temperatura entre -22 y 40 ªC: ");
            t = tc.nextInt();
        }
        return t;
    }

    /**
     * Muestra por pantalla
     *
     * @param a Media de la temperatura mensual
     * @param b Temperatura maxima de todo el mes
     * @param c Numero de dia en el que se registra la temperatura maxima
     * @param d Temperatura minima registrada en todo el mes
     * @param e Dia en que se registra dicha temperatura minima
     */
    public static void mostrarDatos(double a, double b, double c, double d, double e) {
        System.out.println("\t\tºC\tºF\t Dia");
        System.out.println("Temp. Media\t" + a + "\t" + celsiusAFarenheit(a) + "\t---");
        System.out.println("Temp. Max\t" + b + "\t" + celsiusAFarenheit(b) + "\t" + c);
        System.out.println("Temp. Max\t" + d + "\t" + celsiusAFarenheit(d) + "\t" + e);
    }

    /**
     *
     * @param t
     * @return
     */
    public static double celsiusAFarenheit(double t) {
        double f = 1.8 * t + 32;
        return f;
    }

}
