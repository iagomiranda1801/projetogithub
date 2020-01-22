/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayVetores;

import java.util.Scanner;

/**
 *
 * @author Iago
 */
public class programPensao {

    private static int i;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Quantos quartos vão ser alugados: ");
        int n = s.nextInt();
        if (n > 10 || n < 0) {
            System.out.println("So temos dez quartos na pensão!!");
        } else {

            aluguelPensao[] quartos = new aluguelPensao[n];
            for (int i = 0; i < n; i++) {
                s.nextLine();
                String name = "";
                String email = "";
                int quarto = 0;
                System.out.println("Nome: ");
                name = s.nextLine();
                System.out.println("E-mail: ");
                email = s.nextLine();
                System.out.println("Número do quarto:");
                quarto = s.nextInt();
                quartos[i] = new aluguelPensao(name, email, quarto);

            }

            for (int i = 0; i < n; i++) {

                System.out.println("posicao " + i);
                System.out.println(quartos[i]);

            }

        }
    }
}
