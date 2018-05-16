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
public class Ejercicio2 {
    public static void main(String[] args) {
        //Declaracion devariables y llamada de funcion Scanner
        Scanner entrada=new Scanner(System.in);
        
        double x;
        double y;
        double z;
        double m;
        
        System.out.println("Ingrese el valor de la variable X: ");
        x = entrada.nextDouble();
        System.out.println("Ingrese el valor de la variable Y: ");
        y = entrada.nextDouble();
        System.out.println("Ingreese el valor de la variable Z: ");
        z = entrada.nextDouble();
        
        m = ((x+(y/z))/(x-(y/z)));
        
        System.out.println("El valor de m en base a las variables: ");
        System.out.printf("x= %f\n", x);
        System.out.printf("y= %f\n", y);
        System.out.printf("z= %f\n", z);
        System.out.println("Da como resultado:");
        System.out.printf("m= %f", m);      
}
}
