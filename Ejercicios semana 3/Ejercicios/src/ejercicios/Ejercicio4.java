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
public class Ejercicio4 {

    public static void main(String[] args) {
        //declaracion de variables y llamada de scaner
        Scanner entrada = new Scanner(System.in);

        double precio;
        double desc;
        double subt;
        double total;

        int num;

        System.out.println("Ingrese el precio del balon: ");
        precio = entrada.nextDouble();

        System.out.println("Ingrese el numero de balones a comprar: ");
        num = entrada.nextInt();

        if (num == 1) {
            desc = 0.5;
        } else {
            if (num == 2) {
                desc = 0.7;
            } else {
                desc = 0.8;
            }
        }
        subt = precio * num;
        desc = subt * desc;
        total = subt - desc;

        System.out.printf("Costo por balon: %f\n", precio);
        System.out.printf("Numero de balones comprados: %d\n", num);
        System.out.printf("Subtotal: %f\n", subt);
        System.out.printf("Descuento: %f\n", desc);
        System.out.printf("Total: %f\n", total);
    }
}
