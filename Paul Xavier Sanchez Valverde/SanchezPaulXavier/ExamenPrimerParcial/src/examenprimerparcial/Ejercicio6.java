/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenprimerparcial;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        //Declaracion de variables y llamada de al funcion Scanner
        Scanner entrada = new Scanner(System.in);

        int mes;
        int dia = 0;

        System.out.println("Ingrese el numero de mes correspondiente (1-12): ");
        mes = entrada.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia = 31;
                break;
            case 2:
                dia = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;
            default:
                System.out.println("El mes ingresado no corresponde al calendario");
        }
        System.out.printf("El mes %d", mes);
        System.out.printf(" tiene %d", dia);
        System.out.printf(" dias.\n");

    }

}
