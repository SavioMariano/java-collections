package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class ProdutoNumeros {
    public static void main(String[] args) {
        /*
        Desafio 12 - Encontre o produto de todos os números da lista:
        Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoList = numeros.stream()
        .reduce(1, (n,n2) -> n * n2);

        System.out.println(produtoList);
    }
}
