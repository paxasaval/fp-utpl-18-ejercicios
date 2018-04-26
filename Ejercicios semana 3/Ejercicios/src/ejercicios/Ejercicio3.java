/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //Declaraciond e vaiables y llamadade scaner
        Scanner entrada = new Scanner(System.in);

        double x;
        double y;

        System.out.println("INgrese el valor de la variable x: ");
        x = entrada.nextDouble();

        if (x < 0) {
            y = 3 * x + 10;
        } else {
            if (x > 0) {
                y = (x *x)+6;
            } else {
                y = 1;
            }
        }
        System.out.printf("El valor de y es: %f\n", y);
    }
}

