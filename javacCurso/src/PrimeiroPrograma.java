
import static java.time.Clock.system;
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
public class PrimeiroPrograma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minutos = 0;
        int juros   = 0;
        int conta   = 0;

        System.out.println("Quantos minutos você utilizou? ");
        minutos = sc.nextInt();

        if (minutos == 100) {
            
            conta = 50;
            
            System.out.println("O valor da conta a ser pago é de R$ " + conta + ",00.");
        } else {
            
                if (minutos > 100) {
                
                conta = 50;
                
                System.out.println("Esse valor é necessário cobrar juros.");

                juros = (minutos - 100) * 2;
                conta += juros;
              
                System.out.println("O valor a ser pago é de " + conta + ",00");

            }

            sc.close();
        }

    }
}
