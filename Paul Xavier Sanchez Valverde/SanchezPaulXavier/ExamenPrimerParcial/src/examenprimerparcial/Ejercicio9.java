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
public class Ejercicio9 {
    public static void main(String[] args) {
        //Declaracion devariables y llamada de funcion Scanner
        Scanner entrada = new Scanner(System.in);
        double a1;
        double b1;
        double c1;
        double a_a1;
        double a_b1;
        double a_c1;
        double a2;
        double b2;
        double c2;
        double a_a2;
        double a_b2;
        double a_c2;
        
        System.out.println("Ingrese el primer lado del triangulo A: ");
        a1=entrada.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo A: ");
        b1=entrada.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo A: ");
        c1=entrada.nextDouble();
        System.out.println("Ingrese el primer angulo del triangulo A: ");
        a_a1=entrada.nextDouble();
        System.out.println("Ingrese el segundo angulo del triangulo A: ");
        a_b1=entrada.nextDouble();
        System.out.println("Ingrese el tercer angulo del triangulo A: ");
        a_c1=entrada.nextDouble();
        
        System.out.println("Ingrese el primer lado del triangulo B: ");
        a2=entrada.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo B: ");
        b2=entrada.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo B: ");
        c2=entrada.nextDouble();
        System.out.println("Ingrese el primer angulo del triangulo B: ");
        a_a2=entrada.nextDouble();
        System.out.println("Ingrese el segundo angulo del triangulo B: ");
        a_b2=entrada.nextDouble();
        System.out.println("Ingrese el tercer angulo del triangulo B: ");
        a_c2=entrada.nextDouble();
        
        if (((a1==a2 && b1==b2 && c1==c2) || (a1==b2 && b1==c2 && c1==a2) || (a1==c2 && b1==a2 && c1==b2)) && ((a_a1==a_a2 && a_b1==a_b2 && a_c1==a_c2) || (a_a1==a_b2 && a_b1==a_c2 && a_c1==a_a2) || (a_a1==a_c2 && a_b1==a_a2 && a_c1==a_b2))){
            System.out.println("Los triangulos A y B son congruentes");
        }else{
            System.out.println("Los triangulos A y B NO son congruentes");
        }
      
    }
}
