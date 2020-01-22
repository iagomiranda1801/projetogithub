/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iago
 */
public class funcionario {
    
    public String name;
    public double grossSalary;
    public double tax;
    public double total;
    public double perce;
    
    public double netSalary() {
    
    double total = grossSalary - tax;
    
    return total;
}
    public double salaryPercentage() {
        
        double salary = grossSalary - (perce/100) * grossSalary ;
        
        return salary;
        
    }
    
    @Override
    public String toString() {
        
        
    return name
            + " - Salário Bruto:$"
            + String.format("%.2f ", grossSalary)
            + " - A taxa a ser descontada:$"
            + String.format("%.2f ", tax)
            + " - O salário líquido:$"
            + String.format("%.2f " , netSalary())
            + " - O salário bruto menos o percentual digitado:$"
            + String.format("%.2f", salaryPercentage());
}
}
