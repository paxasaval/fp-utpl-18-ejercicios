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
public class Ejercicio2 {
    public static void main(String[] args) {
        //declaracion de variables y llamada de entrada
        Scanner entrada=new Scanner(System.in);
        
        int num;
        int tipo;
        
        double precio;
        double desc = 0;
        double subt;
        double total;
        
        String nombre;
        
        System.out.println("Ingresar el nombre del cliente: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el tipo del cliente (1,2 o 3): ");
        tipo = entrada.nextInt();
        
        System.out.println("Ingrese el precio del celular: ");
        precio = entrada.nextDouble();
        
        System.out.println("Ingrese el numero de celulares vendidos: ");
        num = entrada.nextInt();
        
        switch (tipo) {
            case 1:
                desc = 0.10;
                break;
            case 2:
                desc = 0.20;
                break;
            case 3:
                desc = 0.30;
                break;
            default:
                System.out.println("El tipo indicado no corresponde a los establecidos");
        }
        subt = precio*num;
        desc = subt*desc;
        total = subt-desc;
        
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Tipo de Cliente: %s\n", tipo);
        System.out.printf("Cantidad de celulares: %d\n", num);
        System.out.printf("Subtotal a pagar: %f.\n", subt);
        System.out.printf("Descuento: %f.\n", desc);
        System.out.printf("Valor final a pagar: %f.\n", total);   
    }
}     