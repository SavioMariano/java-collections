package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class VerificacaoNumeroNegativo {
    public static void main(String[] args) {
        /*
        Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console. 
        */

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificarNegativoList = numeros.stream()
        .anyMatch(n -> n < 0);

        System.out.println("Verificando se existe pelo menos um numero negativo na lista");
        System.out.println(verificarNegativoList);


    }
}
