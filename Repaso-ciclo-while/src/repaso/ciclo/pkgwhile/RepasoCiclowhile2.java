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
public class RepasoCiclowhile2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int num;
        int i = 1;
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;
        int argentina = 0;
        int chile = 0;
        int colombia = 0;
        int otros = 0;
        double total_impuestos = 0;
        double total_pv = 0;
        String cadenafinal = String.format("%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");

        System.out.println("Ingrese la cantidad de vehiculos: ");
        num = entrada.nextInt();

        while (i <= num) {

            System.out.printf("Vehiculo %d\n", i);
            
            entrada.nextLine();

            System.out.println("Ingrese el nombre de la marca: ");
            marca = entrada.nextLine();

            System.out.println("Ingrese el pais de origen del vehiculo: ");
            origen = entrada.nextLine();

            System.out.println("Ingrese el costo del vehiculo: ");
            costo = entrada.nextDouble();
            if (origen.equals("Argentina")) {
                impuesto = costo * 0.20;
                argentina = argentina + 1;
            } else {
                if (origen.equals("Colombia")) {
                    impuesto = costo * 0.25;
                    colombia = colombia + 1;
                } else {
                    if (origen.equals("Chile")) {
                        impuesto = costo * 0.30;
                        chile = chile + 1;
                    } else {
                        impuesto = costo * 0.40;
                        otros = otros + 1;
                    }
                }
            }
            precio_venta = costo + impuesto;
            cadenafinal = String.format("%s%-10s\t\t%-10s\t\t%.2f\t\t%-10.2f\t\t%.2f\n", cadenafinal, marca, origen, costo, impuesto, precio_venta);
            total_impuestos = total_impuestos + impuesto;
            total_pv = total_pv + precio_venta;
            i = i + 1;
        }
        System.out.printf("\t\t\tReporte de Autos Importados\n");
        System.out.printf("%s", cadenafinal);
        System.out.printf("\nTotal Autos\t%d\t\tTot. Imps\t%.2f\t\tTot. PV\t%.2f\n", num, total_impuestos, total_pv);
        System.out.printf("\nArgentina \t%d\n", argentina);
        System.out.printf("Colombia    \t%d\n", colombia);
        System.out.printf("Chile       \t%d\n", chile);
        System.out.printf("Otros Paises\t%d\n", otros);

    }

}
