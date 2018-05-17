/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1.primerbimestre;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limit;
        
        double sueldo;
        double pasaje;
        double bar;
        double salida;
        
        double saldo;
        double sub_pasaje=0;
        double sub_bar=0;
        double sub_salida=0;
        double subt;
        
        String cadenafinal=String.format("%s\t\t%s\t\t%s\t\t%s\n", "Peronsa","Pasajes","Bar","Salida");
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Cuantos hijos tiene: ");
        limit=entrada.nextInt();
        
        System.out.println("Cuanto gana a la semana: ");
        sueldo=entrada.nextDouble();
        
        for (int contador=1; contador<=limit; contador++){
            System.out.printf("Hijo %d\n", contador);
            
            System.out.printf("Cuanto dinero le pide su hijo para pasajes: ");
            pasaje=entrada.nextDouble();
            
            System.out.printf("Cuanto dinero le pide su hijo para gastar en el Bar escolar: ");
            bar=entrada.nextDouble();
            
            System.out.printf("Cuanto dinero le pide su hijo para salir: ");
            salida=entrada.nextDouble();
            
            cadenafinal=String.format("%s%s %d\t\t%.2f\t\t%.2f\t\t%.2f\n",cadenafinal,"Hijo",contador,pasaje,bar,salida);
            
            
            sub_pasaje=sub_pasaje+pasaje;
            sub_bar=sub_bar+bar;
            sub_salida=sub_salida+salida;            
        }
        subt=sub_pasaje+sub_bar+sub_salida;
        System.out.println("\n\n\t\tGastos Familiares");
        System.out.printf("%s\n",cadenafinal);
        System.out.printf("Total\t\t%.2f\t\t%.2f\t\t%.2f\n",sub_pasaje,sub_bar,sub_salida);
        if (sueldo<subt){
            System.out.println("El padre NO puede cumplir con los gastos esta semana");
        }else{
            if (subt==sueldo){
                System.out.println("El padre logra cubrir con las justas los gastos de esta semana");
            }else{
                double resto=sueldo-subt;
                System.out.printf("El padre logra cubrir con los gastos de esta semana y le sobran %.2f dolares\n",resto);
            }
        }
        
               
    }
    
}
