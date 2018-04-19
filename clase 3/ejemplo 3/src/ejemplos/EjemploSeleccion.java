/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 Crear un programa que permita ingresar una calificación por teclado, si la 
 calificación ingresada es mayor o igual a 5 y la calificación es menor a 10 
 se debe presentar un mensaje que diga "Usted esta en supletorios". 
 De lo contrario se presenta el valor de la calificacion dividido para 2.

 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class EjemploSeleccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificación: ");
        calificacion = entrada.nextDouble();
        if (calificacion >= 5 && calificacion < 10) {
            System.out.println("Usted esta en supletorios");
        } else {
            //System.out.printf("%d", calificacion/2);
            double resultado = calificacion/2;
            System.out.printf("%f", resultado);
        }

    }
    

}
