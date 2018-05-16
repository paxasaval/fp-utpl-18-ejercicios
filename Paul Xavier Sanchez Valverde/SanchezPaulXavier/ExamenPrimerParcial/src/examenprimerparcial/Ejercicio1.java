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
public class Ejercicio1 {
    public static void main(String[] args) {
        //Declaracion devariables y llamada de funcion Scanner
        Scanner entrada=new Scanner(System.in);
        
        double longitud;
        double anchura;
        double superficie;
        
        System.out.println("Ingrese la longitud de la habitacion: ");
        longitud = entrada.nextDouble();
        
        System.out.println("Ingrese la anchura de la habitacion: ");
        anchura = entrada.nextDouble();
        
        superficie = anchura*longitud;
        
        System.out.printf("La superficie de la habitacion es de : %.3f", superficie);
    
    }
}
