/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeDolar;



/**
 *
 * @author Iago
 */
public class currencyConverter {

    public static double totalDolar(double dolar, double dolarReais) {
        
      
        double valorperc = 6.0/100.0;
        
        double resul  = dolarReais + (valorperc * dolarReais);
        return resul;        
    
}
}