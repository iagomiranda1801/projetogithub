/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExFuncionario;

/**
 *
 * @author Iago
 */
public class Empregado {

    int id;
    String name;
    double salario;
    int perce;

    Empregado(String name, int id, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salario;
    }

    public void setSalary(double salario) {
        this.salario = salario;
    }

    public void salarioAlterado(double perce) {

         salario += (perce / 100) * salario;

       
    }

    @Override
    public String toString() {

        return name
                + " - Id:"
                + id
                + " Salário: "
                + salario;
    }

}
