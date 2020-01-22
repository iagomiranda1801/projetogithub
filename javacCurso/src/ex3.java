
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
public class ex3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num = 0;
        int imp = 0;

        System.out.println("Digite um número maior que 0 ");
        num = s.nextInt();

        if (num > 0) {

            while (num > 0 && num<1000) {
             
                    System.out.println("Digite um número maior que 0 ");
                    num = s.nextInt();
                    
                    if (num % 2 != 0) {
                        if(num > 0 && num < 1000) {
                        
                            imp = num;
                    
                            System.out.println("Os números impares digitados são: " + imp);
                   }
                            
           
            }
          }
       } 
        }
    }  



        
    
    