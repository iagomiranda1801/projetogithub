/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class Lista {
    
    private Noh inicio;
    
    public Lista(){
        this.inicio = null;
    }
    
    public void inserir (int id) {
        
        Noh novo = new Noh();
        novo.setId(id);
        novo.setProximo(null);
        
        if (inicio == null) {
            
            inicio = novo;
            
        } else {
        
        Noh aux;
        aux = inicio;
        
        while (aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        aux.setProximo(novo);
    }
    
    }

        
    
    
    public int retirar() {
        
        if (inicio != null) {
            
        
        Noh aux = inicio;
        int id  = aux.getId();
        inicio  = aux.getProximo();
        
        return id;
        
    } else {
            
    
        throw new RuntimeException ("Lista vazia");
            
        
                }
    }
    
    
    public void listartodos() {
        
        
        if (inicio == null) { 
            System.out.println("Lista Vazia!!!");
        } else {
            Noh aux = inicio;
            while (aux.getProximo() != null) {
                System.out.println("Id visto = " + aux.getId());
                aux = aux.getProximo();
            }
        }
        
    }
    
    public boolean isEmpty() {
        return false;
       
    }
    
}

