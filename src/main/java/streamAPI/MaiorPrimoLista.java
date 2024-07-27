package main.java.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaiorPrimoLista {
    public static void main(String[] args) {
        /*
        Desafio 14 - Encontre o maior número primo da lista:
        Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimoList = numeros.stream()
        .filter(n -> n % 2 == 1)
        .sorted(Collections.reverseOrder())
        .findFirst();

        System.out.println(maiorPrimoList);

    }
}
