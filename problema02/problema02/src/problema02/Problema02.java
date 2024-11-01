/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] nombres = new String [3];
        double[] gastos = new double [3];
        double totalgastos = 0;
        for (int i=0; i < 3; i++){
        System.out.println("Ingrese nombre del Hijo"+(i+1)+":");
        nombres[i] = scanner.nextLine();
        System.out.println("Ingrese los gastos de\n" + nombres[i] +": ");
        gastos[i] = scanner.nextDouble();
        scanner.nextLine();
         }
        for (double gasto : gastos){
            totalgastos += gasto;
        }
        System.out.println("\nResumen de gastos:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Hijo: " + nombres[i] + ", Gastos: $" + gastos[i]);
        }
        
        System.out.println("Total de gastos: $" +totalgastos);
    }


}
