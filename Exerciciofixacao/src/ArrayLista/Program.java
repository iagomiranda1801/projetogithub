/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Iago
 */
public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("joão");
        list.add("Jose");
        list.add("rita");
        list.add("Anna Carolina");
        list.add("Ana Laura");
        list.add("Alessandra");

        for (String x : list) {

            System.out.println(x);

        }

        System.out.println(" ----------------------------------------");

        list.removeIf(x -> x.charAt(0) == 'r');

        for (String x : list) {

            System.out.println(x);
        }

        System.out.println(" -------------------------------------------");
        System.out.println(" IndexOf: " + list.indexOf("Jose"));

        System.out.println(" -------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {

            System.out.println(x);

        }

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
