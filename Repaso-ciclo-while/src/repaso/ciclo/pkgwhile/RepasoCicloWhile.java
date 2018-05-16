/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RepasoCicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean articulo;
        String opcion;
        String art_name;
        int art_cant;
        double art_cost;
        double precio_total;
        double subt=0;
        double iva;
        double total;
        String nombre;
        String cadenafinal=String.format("\n%s\t%s\t%s\t%s\n", "Articulo", "Cantidad", "Precio Unitario", "Precio Total");
        
        System.out.println("ingrese el nombre del cliente: ");
        nombre=entrada.nextLine();
        System.out.println("Desea ingresar un articulo (S/N): ");
        opcion=entrada.nextLine();
           if ((opcion.equals("S"))||(opcion.equals("s"))){
               articulo=true;
           }else{
               articulo=false;
           }         
       while (articulo){
           System.out.println("Ingrese el nombre del articulo: ");
           art_name=entrada.nextLine();
           System.out.println("Ingrese la cantidad de articulos: ");
           art_cant=entrada.nextInt();
           System.out.println("ingrese el precio unitario del articulo: ");
           art_cost=entrada.nextDouble();
           precio_total=art_cant*art_cost;
           
           cadenafinal=String.format("%s%s\t%d\t\t%.2f\t\t%.2f\n", cadenafinal , art_name, art_cant, art_cost, precio_total);
           
           subt=subt+precio_total;
           
           
           entrada.nextLine();
           
           System.out.println("Desea ingresar un articulo (S/N): ");
           opcion=entrada.nextLine();
           if (opcion.equals("S")||opcion.equals("s")){
               articulo=true;
           }else{
               articulo=false;
           }
       }
       iva=0.14*subt;
       total=subt+iva; 
       System.out.printf("\tFactura\n");
       System.out.printf("Supermercado todo a menor precio\n");
       System.out.printf("Nombre del cliente: %s\n", nombre);
       System.out.printf("%s",cadenafinal);
       System.out.printf("\t\t\t\tSubtotal\t%.2f\n", subt);
       System.out.printf("\t\t\t\tI.V.A\t\t%.2f\n", iva);
       System.out.printf("\t\t\t\tTotal\t\t%.2f\n", total);
       
       
        
       
       
        
           
        
               
    }
    
}
