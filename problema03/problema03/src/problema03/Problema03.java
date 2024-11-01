/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el costo por minuto\n");
        double costopormin = scanner.nextDouble();
        System.out.print("Ingrese el numero de minutos consumidos en el mes\n");
        int minutosconsumidos = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese la direccion del domicilio\n");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el nombre completo del dueño de la linea\n");
        String nombreCompleto = scanner.nextLine();
        double costo_total = costopormin * minutosconsumidos;
        System.out.println("\n\nREPORTE");
        System.out.println("Nombres Completos:" + nombreCompleto);
        System.out.println("Direccion:" + direccion);
        System.out.println("Costo por minuto: $" + costopormin);
        System.out.println("Numero de minutos consumidos:" + minutosconsumidos);
        System.out.println("Valor a cancelar: $" + costo_total);
    }
}


