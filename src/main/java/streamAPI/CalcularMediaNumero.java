package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class CalcularMediaNumero {
    public static void main(String[] args) {
        /*
        Calcule a média dos números maiores que 5: Com a Stream API, 
        calcule a média dos números maiores que 5 e exiba o resultado no console.
        */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int mediaNumeros = numeros.stream()
        .filter(n -> n >= 5)
        .reduce(0, (n , n2) -> n + n2 );

        System.out.println(mediaNumeros);

    }
}