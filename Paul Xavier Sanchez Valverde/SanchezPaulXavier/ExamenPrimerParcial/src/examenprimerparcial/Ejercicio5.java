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
public class Ejercicio5 {
    public static void main(String[] args) {
        //Declaracion devariables y llamada de funcion Scanner
        Scanner entrada = new Scanner(System.in);
        
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double calificacion4;
        double promedio;
        
        String puntuacion;
        
        System.out.println("Ingrese la calificacion 1 del estudiante: ");
        calificacion1 = entrada.nextDouble();
        
        System.out.println("Ingrese la calificacion 2 del estudiante: ");
        calificacion2 = entrada.nextDouble();
        
        System.out.println("Ingrese la calificacion 3 del estudiante: ");
        calificacion3 = entrada.nextDouble();
        
        System.out.println("Ingrese la calificacion 4 del estudiante: ");
        calificacion4 = entrada.nextDouble();
        
        promedio = (calificacion1+calificacion2+calificacion3+calificacion4)/4;
        
        if (promedio<=100 && promedio>=90){
            puntuacion = "A";
        }else{
            if (promedio<90 && promedio>=80){
                puntuacion = "B";
            }else{
                if(promedio<80 && promedio>=70){
                    puntuacion = "C";
                }else{
                    puntuacion = "D";
                }
            }
        }
        
            System.out.printf("El estudaintes con promedio de: %f", promedio);
            System.out.printf(", tiene una calificcacion de: %s\n", puntuacion);
    }
}
