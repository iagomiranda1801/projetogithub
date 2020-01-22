
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
public class Ex2 {
    
    public static void main (String[] args) {
        
        
       Scanner s = new Scanner (System.in);
       
       String cpfcom;
       String cpf;
       
       System.out.println("Digite seu cpf por favor");
       cpf = s.nextLine();
       
       if(cpf.length()> 11 || cpf.length() < 0) {
           
           System.out.println("CPF INVÁLIDO");
           
       } else {
           
           String[] vect  = cpf.split(" ");
           
           
           System.out.println(vect[2]);
           
           
       }
       
       
    }
}