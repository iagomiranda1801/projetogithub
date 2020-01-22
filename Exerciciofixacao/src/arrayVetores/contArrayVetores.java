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
public class contArrayVetores {
    
    public static void main (String[] args ) {
        
        Scanner s = new Scanner (System.in);
        
        int n = s.nextInt();
        product[] vect = new product[n];
        
        for (int i = 0; i<n; i++) {
            s.nextLine();
            String name  = s.nextLine();
            double price = s.nextDouble();
            vect[i] = new product(name,price);
            }
        
        double sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vect[i].getPreco();
             }
        
        double avg = sum / n;
       
        System.out.printf("A média de preços dos produtos é = %.2f%n" , avg);
        
    }
    
}
