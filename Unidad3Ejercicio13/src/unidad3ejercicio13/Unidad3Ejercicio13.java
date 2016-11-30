/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio13;

/**
 *
 * @author loren
 */
public class Unidad3Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bis;
        bis=esBisiesto(2010);
        numDiasMes(1, 2010);
        
    }
    public static int esBisiesto(int a){
    if (a%4==0 && a%100!=0 || a%400==0){
    }return a;
    }
    public static void numDiasMes(int m, int a){
    int numDias;
    int bis=esBisiesto(a);
        switch (m){
        case 1:case 3:case 5:case 7:case 8:case 10:case 12:numDias=31;break;
        case 4:case 6:case 9:case 11:numDias=30;break;
        case 2:if (bis==true){
        numDias=28;
        };break;
    } 
        
    }
}
