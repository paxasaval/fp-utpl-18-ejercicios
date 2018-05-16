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
public class Ejercicio8 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Declaracion de variables y llamada de al funcion Scanner
        Scanner entrada = new Scanner(System.in);

        String v1;
        String v2;
        String v3;

        System.out.println("Ingrese una letra del abecedario en MAYUSCULAS");
        v1 = entrada.nextLine();

        System.out.println("Ingrese una letra del abecedario en MAYUSCULAS");
        v2 = entrada.nextLine();

        System.out.println("Ingrese una letra del abecedario en MAYUSCULAS");
        v3 = entrada.nextLine();

        if ((v1.compareTo(v2)<0 && v1.compareTo(v3)<0)){
            System.out.printf("La primera letra en aparecer en el abecedario es la: %s\n", v1);
        } else {
            if (v2.compareTo(v3)<0 && v2.compareTo(v1)<0){
                System.out.printf("La primera letra en aparecer en el abecedario es la: %s\n", v2);
            } else {
                System.out.printf("La primera letra en aparecer en el abecedario es la; %s\n", v3);
            }
        }

    }
}
