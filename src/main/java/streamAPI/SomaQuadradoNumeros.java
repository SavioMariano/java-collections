package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SomaQuadradoNumeros {
    public static void main(String[] args) {
        /*
        Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaQuadradoList = numeros.stream()
        .map(n -> n * n)
        .peek(System.out::println)
        .reduce(0, (n1, n2) -> n1 + n2) ;

        System.out.println(somaQuadradoList);
    }
}
