/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class produtos {
    
    private String name;
    private int quantity;
    private double price;
    
    public produtos (String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
     public produtos (String name,double price) {
        this.name = name;
        this.price = price;
    }
     
     public String getName() {
         return name;
     }
     
     public void setName (String name){
         this.name = name;
     }
     
     public double getPrice(){
         return price;
         }
     
     public void setPrice(double price) {
         this.price = price;
     }
     
     public double getPrice(double price) {
         return price;
     
     }
     public int getQuantity(int quantity) {
         return quantity;
     }
    
    public double valueTotalStock() {
        double p = (quantity * price);
        return p;
    }
    
    public void addNewProducts(int quantity){
        
       this.quantity += quantity;
       
       }
    
    public void removeProducts (int quantity) {
        
        this.quantity -= quantity;
        
    }
    
    @Override
    public String toString(){
    
        return name
                + ", $"
                +String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades, Total $"
                + String.format("%.2f" , valueTotalStock());
      }
    
        
    }


