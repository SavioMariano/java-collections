package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumerosPrimo {
    public static void main(String[] args) {
        /*
        Desafio 17 - Filtrar os números primos da lista:
        Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11    );

        List<Integer> numerosPrimo = numeros.stream()
        .filter(n -> n == 2 || n % 2 != 0 )
        .toList();
    
        System.out.println(numerosPrimo);

    }
}
