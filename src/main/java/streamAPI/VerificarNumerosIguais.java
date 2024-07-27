package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class VerificarNumerosIguais {
    public static void main(String[] args) {
        /*
        Desafio 18 - Verifique se todos os números da lista são iguais:
        Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console. 
        */

        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        boolean numerosIguaisList = numeros.stream().sorted().count() == 1;

        System.out.println(numerosIguaisList);
    }
}
