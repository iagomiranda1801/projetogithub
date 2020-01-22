
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class ProgramaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        System.out.println("Name: ");
        String name = s.nextLine();

        System.out.println("Numero da conta: ");
        int numconta = s.nextInt();

        System.out.println(" Saldn em conta: ");
        double saldoConta = s.nextDouble();

        System.out.println(" Deseja fazer um deposito ? 1- sim 2-nao");
        int dep = s.nextInt();
        
        Banco bank = new Banco (name, numconta, saldoConta, saldoConta, saldoConta);

        if (dep == 2) {
            
            System.out.println(" sem depósito!!");
            
            System.out.println(" Nome; " + bank.getName());
            System.out.println(" Saldo da conta: " + bank.getSaldoConta());
            System.out.println(" Número da conta: " + bank.getNumconta());

            

        } else if (dep == 1) {

            System.out.println("Valor do deposito: ");
            double deposito = s.nextDouble();

            System.out.println(bank);

            System.out.println("Digite o valor do saque: ");
            double saque = s.nextDouble();

            bank.saqueConta(saque, deposito);

            System.out.println(bank);

        }
    }
}
