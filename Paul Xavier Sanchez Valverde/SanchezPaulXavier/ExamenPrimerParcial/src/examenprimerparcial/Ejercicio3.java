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
public class Ejercicio3 {

    public static void main(String[] args) {
        //Declaracion devariables y llamada de funcion Scanner
        Scanner entrada = new Scanner(System.in);

        int segundos;
        int minutos;
        int seg;

        System.out.println("Ingrese la cantidad de segundos transcurridos: ");
        segundos = entrada.nextInt();

        minutos = segundos / 60;
        seg = segundos % 60;

        System.out.print(segundos);
        System.out.printf(" segundos es igual a: %d", minutos);
        System.out.printf(" minuto(s) y %d", seg);
        System.out.printf(" segundos \n");
    }
}
