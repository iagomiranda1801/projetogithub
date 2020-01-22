
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class funcoes {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        triangulo x,y;
        x = new triangulo();
        y = new triangulo();
        
        
        System.out.println("Digite as tres áreas do triângulo x: ");
        
        x.a = sc.nextDouble();
        x.b= sc.nextDouble();
        x.c= sc.nextDouble();
        
        System.out.println("Digite as ttês áres do triângulo y: ");
        
        y.a= sc.nextDouble();
        y.b = sc.nextDouble();
        y.c= sc.nextDouble();
        
        
        double areax = x.area();
        
        double areay = y.area();
        
        System.out.println(" A área y do triângulo é: " + areay);
        System.out.println(" A área x do triângulo é: " + areax);
        
        if (areax > areay) {
            System.out.println(" A área maior é a área X");
        } else {
            System.out.println(" A área maior é a área Y");
        }
        
        
        
    }
    
}
