package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class AgruparParImpar {
    public static void main(String[] args) {
        /*
        Desafio 16 - Agrupe os números em pares e ímpares: Utilize a Stream API para agrupar os números em duas listas separadas,
        uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        List<Integer> numerosPar = numeros.stream()
        .filter(n -> n % 2 == 0)
        .toList();

        List<Integer> numerosImpar = numeros.stream()
        .filter(n -> n % 2 == 1)
        .toList();

        System.out.println("Numeros Par");
        System.out.println(numerosPar);

        System.out.println("Numeros Impar");
        System.out.println(numerosImpar);
    }
}
