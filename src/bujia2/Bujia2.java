/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bujia2;

import java.util.Random;

/**
 *
 * @author SERGIO ANDRES
 */
public class Bujia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              Random random = new Random();

        int entero = random.nextInt(100); // de 0 a 99
        double decimal = random.nextDouble(); // entre 0.0 y 1.0
        boolean booleano = random.nextBoolean(); // true o false

        System.out.println("Número entero aleatorio: " + entero);
        System.out.println("Número decimal aleatorio: " + decimal);
        System.out.println("Valor booleano aleatorio: " + booleano);
    //bujia

    }
    
}
