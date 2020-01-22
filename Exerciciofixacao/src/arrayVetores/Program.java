/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayVetores;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class Program {
    
    public static void main (String[] args) {
        Scanner z = new Scanner (System.in);
        
        int n = z.nextInt();
        double[] vect = new double[n];
        
        for (int i = 0; i<n; i++) {
            
              vect[i] = z.nextDouble();
        }
        
        double sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vect[i];
            }
        
        double avg = sum / n;
        
        System.out.printf("A média dos valores é igual = %.2f%n", avg);
    }
            
    
}
