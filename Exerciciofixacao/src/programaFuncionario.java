
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
public class programaFuncionario {
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        funcionario func = new funcionario ();
        
        System.out.println(" Digite os dados de um funcionário: ");
        
        System.out.println(" Name: ");
        func.name = s.nextLine();
        
        System.out.println(" Gross Salary: ");
        func.grossSalary = s.nextDouble();
        
        System.out.println(" Tax: ");
        func.tax = s.nextDouble();
        func.netSalary();
        
        System.out.println(" Digite o percentual a ser descontado no seu salário: ");
        func.perce = s.nextDouble();
        func.salaryPercentage();
        
        System.out.println(func);
          
        
    }
    
}
