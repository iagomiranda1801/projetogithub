/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class triangulo {
    
    double a;
    double b;
    double c;
    
    public double area() {
        
        double p = (a + b + c) / 2.0;
        double resu = Math.sqrt(p *(p-a) * (p-b) * (p-c));
        
        return resu;
        }
}
