/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import funcaoRaio.funcaoRaio;
import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class program {
    
   public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
       
        System.out.println(" Enter radius: ");
        double radiun = s.nextInt();
        
        double c = funcaoRaio.circunference(radiun);
        
        double v = funcaoRaio.volume(radiun);
        
        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", funcaoRaio.pi);
        
    }
    
}

