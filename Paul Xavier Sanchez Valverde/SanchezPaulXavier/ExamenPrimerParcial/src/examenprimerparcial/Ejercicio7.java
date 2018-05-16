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
public class Ejercicio7 {
    public static void main(String[] args) {
        //Declaracion de variables y llamada de al funcion Scanner
        Scanner entrada = new Scanner(System.in);
        
        double sueldo_base=360.40;
        double bono;
        double ventas;
        double sueldo_total;
        System.out.println("Ingrese el total de ventas del empleado: ");
        ventas = entrada.nextDouble();
        
        if (ventas<=500){
            bono = 0.05;
        }else{
            if(ventas>500 && ventas<=1000){
                bono = 0.08;
            }else{
                if(ventas>1000 && ventas<5000){
                    bono = 0.10;
                }else{
                    bono = 0.15;
                }
            }
        }
        sueldo_total=sueldo_base+(ventas*bono);
        System.out.printf("El empleado con un total de %f", ventas);
        System.out.printf(" dolares en ventas recibe un sueldo de %f", sueldo_total);
        System.out.printf(" dolares el presente mes \n");
    }    
}
