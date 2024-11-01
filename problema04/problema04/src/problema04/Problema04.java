/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       Scanner scanner = new Scanner(System.in);
        double cpu, teclado, pantalla, raton;
        System.out.println("Ingrese el precio del CPU");
        cpu =entrada.nextDouble();
        System.out.println("Ingrese el precio del Teclado");
        teclado =entrada.nextDouble();
        System.out.println("Ingrese el precio de la Pantalla");
        pantalla =entrada.nextDouble();
        System.out.println("Ingrese el precio del Raton");
        raton =entrada.nextDouble();
        System.out.println("Ingrese el nombre del Cliente");
        String cliente = scanner.nextLine();
        double costo_total = cpu + teclado + pantalla + raton;
        System.out.println("\n\nREPORTE:");
        System.out.println("Nombres del Cliente: " + cliente);
        System.out.println("Valores inciales:");
        System.out.println("CPU: $" + cpu);
        System.out.println("Teclado: $" + teclado);
        System.out.println("Raton: $" + raton);
        System.out.println("Pantalla: $" + pantalla);       
        System.out.println("\nValor a cancelar: $" + costo_total);
    }
}
