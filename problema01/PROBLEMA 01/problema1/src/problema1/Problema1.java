/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double base, altura, area;
        System.out.println("Escriba la base del triangulo");
        base=entrada.nextDouble();
        System.out.println("Escriba la altura del triangulo");
        altura=entrada.nextDouble();
        area=base*altura/2;
        
        System.out.println("El area del triangulo es"+area);
        
        
    }
    
}
