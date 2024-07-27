package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class VerificarMaiorDez {
    public static void main(String[] args) {
        /*
        Desafio 6 - Verificar se a lista contém algum número maior que 10:
        Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 15, 17);

        List<Integer> numerosMaiorDez = numeros.stream()
        .filter(n -> n >= 10)
        .toList();

        System.out.println(numerosMaiorDez);

    }
}
