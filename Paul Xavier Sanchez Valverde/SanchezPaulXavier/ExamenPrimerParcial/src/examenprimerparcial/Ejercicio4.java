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
public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaracion devariables y llamada de funcion Scanner
        Scanner entrada = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double x;
        double y;
        
        System.out.println("Ingrese el valor para la Constante (a): ");
        a = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para la Constante (b): ");
        b = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para la Constante (c): ");
        c = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para la Constante (d): ");
        d = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para la Constante (e): ");
        e = entrada.nextDouble();
        
        System.out.println("Ingrese el valor para la Constante (f): ");
        f = entrada.nextDouble();
        
        x=((c*e-b*f)/(a*e-b*d));
        y=((c*e-b*f)/(a*e-b*d)) ;
        
        System.out.printf("Dada la ecuacion las ecuaciones: \n");
        System.out.printf("1.- %f", a);
        System.out.printf("x");
        System.out.printf(" + %f", b);
        System.out.printf("y = %f\n", c);
        System.out.printf("2.- %f", d);
        System.out.printf("x");
        System.out.printf(" + %f", e);
        System.out.printf("y = %f\n",f);
        System.out.printf("tenemos que: \n");
        System.out.printf("x= %f\n", x);
        System.out.printf("y= %f\n", y);
    }
}
