
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
public class programaEstoque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Adicione um produto!! ");

        System.out.println("Digite o nome do produto: ");
        String name = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        double price = sc.nextDouble();

        produtos produto = new produtos(name,price);
        produto.setName("computador");
        produto.setPrice(1200.00);
             
        System.out.println("Update name: " + produto.getName());

        System.out.println(produto);

        System.out.println("Digite a quantidade de produtos a serem adicionados:");
        int quantity = sc.nextInt();
        produto.addNewProducts(quantity);
        System.out.println(produto);

        System.out.println("Digite a quantidade de produtos a serem removidos:");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println(produto);
    }

}
