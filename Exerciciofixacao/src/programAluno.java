
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
public class programAluno {
   
    public static void main (String[] args){
        
        Scanner s = new Scanner (System.in);
        
        alunoNotaFinal aluno = new alunoNotaFinal();
        
        System.out.println(" Digite o nome do aluno: ");
        aluno.name = s.nextLine();
        
        System.out.println(" Digite a nota 1 do aluno: ");
        aluno.nota1 = s.nextDouble();
        
        System.out.println(" Digite a nota 2 do aluno: ");
        aluno.nota2 = s.nextDouble();
        
        System.out.println(" Digite a nota 3 do aluno: ");
        aluno.nota3 = s.nextDouble();
        
        System.out.printf(" Final grade: ", aluno.notaFinal());
        
        if(aluno.notaFinal() < 60) { 
            
            System.out.println("Failed!!");
            System.out.printf("Missing %.2f Points%n",aluno.missingPoints());
            
        }else{
            
            System.out.println("Aproved!!");
            
        }
        
        
    }
}
