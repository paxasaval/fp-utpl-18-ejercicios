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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n_hijos;
        int n_padres;
        
        String nombre;
        String alcanza;
        
        double sueldo;
        double pasaje;
        double bar;
        double salida;
        
        double saldo;
        double sub_pasaje=0;
        double sub_bar=0;
        double sub_salida=0;
        double subt;
        
        String cadenafinal="";
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese el numero de padres de familia para generar el reporte semanal de gastos familiares: ");
        n_padres=entrada.nextInt();
        for (int cont=1;cont<=n_padres;cont++){
            sub_pasaje=0;
            sub_bar=0;
            sub_salida=0;
            subt=0;
            
            entrada.nextLine();
            System.out.println();
            System.out.println("Ingrese el nombre del Padre de Familia: ");
            nombre=entrada.nextLine();
            
         
            System.out.println("Cuantos hijos tiene: ");
            n_hijos=entrada.nextInt();
            System.out.println("Cuanto gana a la semana: ");
            sueldo=entrada.nextDouble();
         
            cadenafinal=String.format("%sNombre de Padre de Familia:  %s\nSueldo Semanal:	$%.2f\nNúmero de Hijos: %d\n\n", cadenafinal,nombre,sueldo,n_hijos);
            cadenafinal=String.format("%s%s",cadenafinal,"Reporte de gastos\n");
            cadenafinal=String.format("%s%s\t\t%s\t\t%s\t\t%s\n", cadenafinal,"Persona","Pasajes","Bar","Salida");

            for (int contador=1; contador<=n_hijos; contador++){
                                
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
            
           cadenafinal=String.format("%sTotal\t\t%.2f\t\t%.2f\t\t%.2f\n",cadenafinal,sub_pasaje,sub_bar,sub_salida);
            if (sueldo<subt){
                alcanza="FALTA";
            }else{
                if (subt==sueldo){
                    alcanza="ALCANZA";
                }else{
                    alcanza="SOBRA";
                }
            }
            cadenafinal=String.format("%s\nEl padre de familia %s le %s el dinero\n",cadenafinal,nombre,alcanza);
            cadenafinal=String.format("%s%s\n", cadenafinal,"***************************************************************************");
        }
        System.out.println("\n\n\t\tReporte de Gastos de Padres de Familia");
        System.out.println("***************************************************************************");
        System.out.printf("%s", cadenafinal);
    }
}