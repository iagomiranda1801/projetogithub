/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class Noh {
    
    private String  nome;
    private int     id;
    private Noh     proximo;
    
    


public void setNome (String nome) {
        
    this.nome = nome;

}

public String getNome (String nome){
    return this.nome;
}

public void setId (int id) {
    this.id = id;
}

public int getId () {
    return this.id;
}

public void setProximo (Noh proximo) {
    this.proximo = proximo;
}
public Noh getProximo () {
    return this.proximo;
}
}

    

