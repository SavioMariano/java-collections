package main.java.streamAPI;

import java.util.Arrays;
import java.util.List;

public class VerificacaoNumerosDistinto {
    public static void main(String[] args) {
        /*
        Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
        */  
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean numerosDistinto = numeros.stream().distinct().count() == numeros.size();

        System.out.println(numerosDistinto);
    }
}
