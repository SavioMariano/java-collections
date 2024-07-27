package main.java.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EncontrarSegundoMaior {
    public static void main(String[] args) {
        /*
        Desafio 7 - Encontrar o segundo número maior da lista:
        Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console. 
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
        .sorted(Collections.reverseOrder())
        .skip(1)
        .findFirst();

        System.out.println(segundoMaior);

    }
}
