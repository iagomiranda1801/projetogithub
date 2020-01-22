/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class listaDeEspera {
    
    public static void main (String args[]) {
        Lista lista = new Lista();
       
       lista.inserir(144);
    
        Noh aux;
        aux = null;
       
        
         while (!lista.isEmpty()) {
             
         
            try {
                
                int elementoret = lista.retirar();
                
                System.out.println("Elemento removido: " + elementoret);
                
                
                
                
            }  catch (RuntimeException elementoret) {
                
                System.out.println("erro: " + elementoret);
            } 
    }
}
}



    
    
   
    
    
