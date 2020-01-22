/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeDolar;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class programDolar {
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        System.out.println(" Enter value dolar: ");
        double dolar = s.nextDouble();
        
        System.out.println(" Enter quantity in the dolar: ");
        double quantity = s.nextDouble();
        
        double dolarReais = dolar*quantity;
        double total = currencyConverter.totalDolar(dolar,dolarReais);
        
        System.out.println(total);
        
        
        
        
    }
    
}
