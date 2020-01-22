/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class Funcionario {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        List<Empregado> list = new ArrayList<>();
        
        int n = 0;
        System.out.println(" Digite quantos funcionário vai cadastrar ");
        n = s.nextInt();
        
        for (int i = 0; i <= n; i++) {
            s.nextLine();
            
            System.out.println(" Nome: ");
            String name = s.nextLine();
            
            System.out.println("Id: ");
            int id = s.nextInt();
            
            System.out.println("Salário: ");
            double salario = s.nextDouble();
            
            list.add(new Empregado(name, id, salario));
            
        }
        
        System.out.println(" --------------------------------------------------");
        
        System.out.println(" Digite o ID do empregado a ser buscado");
        int id = s.nextInt();
        Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        if (emp == null) {
            System.out.println("esse id não existe!!!!!");
        } else {
            
            System.out.println(" Digite a porcentagem do aumento: ");
            int perce = s.nextInt();
            emp.salarioAlterado(perce);
            
        }
        
        for (Empregado obj : list) {
            
            System.out.println(obj);
        }
        
    }
    
}
