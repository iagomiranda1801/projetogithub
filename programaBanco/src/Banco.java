/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class Banco {
    
    private String name;
    private final int  numconta;
    private double deposito;
    private double saque;
    private double saldoConta;

    public Banco(String name, int numconta, double deposito, double saque, double saldoConta) {
        this.name = name;
        this.numconta = numconta;
        this.deposito = deposito;
        this.saque = saque;
        this.saldoConta = saldoConta;
    }
    
    
     
     public double getSaldoConta() {
            
    return saldoConta;
    
}
     
    public String getName() {
        return name;
    }

    public int getNumconta() {
        return numconta;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    
    public void saqueConta(double saque, double deposito) {
        
         this.saldoConta -= saque;
         this.saldoConta -= 5;
        
        
    }
    
    public double totalSalario() {
        
        double saldo = deposito + saldoConta;
        
        return saldo;
        
    }
    
    @Override
    public String toString() {
      
        return name
                    + ", Conta: " 
                    + numconta
                    + " deposito: "
                    + deposito
                    + " Saldo em conta: "
                    + String.format("%.2f",totalSalario());
    }
    
    
}

