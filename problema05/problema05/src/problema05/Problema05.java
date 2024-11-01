/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Scanner scanner =new Scanner(System.in);
        double netflix, youtube, dropbox, spotify;
        System.out.println("Ingrese el precio de NETFLIX");
        netflix =entrada.nextDouble();
        System.out.println("Ingrese el precio de YOUTUBE PREMIUM");
        youtube =entrada.nextDouble();
        System.out.println("Ingrese el precio de DROPBOX");
        dropbox =entrada.nextDouble();
        System.out.println("Ingrese el precio de SPOTIFY");
        spotify =entrada.nextDouble();
        double desc_netflix = netflix * 0.23;
        double netflixcon_desc = netflix - desc_netflix;
        double desc_youtube = youtube * 0.23;
        double youtubecon_desc = youtube - desc_youtube;
        double desc_dropbox = dropbox * 0.45;
        double dropboxcon_desc = dropbox - desc_dropbox;
        double costo_totaldesc = netflixcon_desc + youtubecon_desc + dropboxcon_desc + spotify;
        double costo_total = netflix + youtube + dropbox + spotify;
        System.out.println("\nREPORTE:");
        System.out.println("\nPrecio de NETFLIX sin descuento: $" + netflix);
        System.out.println("Precio de NETFLIX con descuento: $" + netflixcon_desc);
        System.out.println("Precio de YOUTUBE PREMIUM sin descuento: $" + youtube);
        System.out.println("Precio de YOUTUBE PREMIUM con descuento: $" + youtubecon_desc);
        System.out.println("Precio de DROPBOX sin descuento: $" + dropbox);
        System.out.println("Precio de DROPBOX con descuento: $" + dropboxcon_desc);
        System.out.println("Precio de SPOTIFY: $" + spotify);
        
        System.out.println("\n\nValor total mensual a pagar con descuento: $" + costo_totaldesc);
        System.out.println("Valor total mensual a pagar sin descuento: $" + costo_total);
    }
    
}
