/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class alunoNotaFinal {
    
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double notaFinal() {
        
        double resul = nota1 + nota2 + nota3;
        
        return resul;     
    }
    
    public double missingPoints(){
        
        if(notaFinal() < 60) {
            
            return 60 - notaFinal();
            
        }else{
            
        }
        
            return 0.0;
}
}
