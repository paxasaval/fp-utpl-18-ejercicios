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
public class ejericiso {
    public static void main(String[] args) {
        String opcion;
        double a;
        double b;
        double c;
        
        opcion="";
        a=0;
        b=0;
        c=0;
        
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduzca el primer lado: ");
       a=entrada.nextDouble();
       System.out.println("Introduza el segundo lado: ");
       b=entrada.nextDouble();
       System.out.println("Introduzca el tercer lado: ");
       c=entrada.nextDouble();
       
       if ((c>(a+b)||(b>(a+c))||(a>(b+c)))){
           System.out.println("Los tres lados pertenecen a un triangulo");
           if((a==b)||(b==c)||(a==c)){
               opcion="Isoceles";
           }else{
               if ((a==b)&&(b==c)){
                   opcion="Equilatero";
               }else{
                   opcion="Escaleno";
               }
            System.out.printf("El triangulo es: %s\n",opcion);
           }
       }else{
           System.out.println("Los tres lados NO pertenecen a un triangulo");
       }
       
       
        
       
       
          
        
        
        
        
              
    }
}
