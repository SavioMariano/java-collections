package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    List<Integer> listaInteiros;

    public SomaNumeros(){
        this.listaInteiros = new ArrayList<>();  
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public int calcularSoma(){
        int valorTotal = 0;
        if (!listaInteiros.isEmpty()) {
            for (Integer integer : listaInteiros) {
                int valorIterado = integer;
                valorTotal += valorIterado;
            }
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaInteiros.isEmpty()) {
            for (Integer integer : listaInteiros) {
                if (integer >= maiorNumero) {
                    maiorNumero = integer;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!listaInteiros.isEmpty()) {
            for (Integer integer : listaInteiros) {
                if (integer <= menorNumero) {
                    menorNumero = integer;
                }
            }
        }
        return menorNumero;
    }
    
    public void exibirNumeros(){
        System.out.println(listaInteiros);
    }

    public static void main(String[] args) {
        
        SomaNumeros somanumeros = new SomaNumeros();

        somanumeros.adicionarNumero(1);
        somanumeros.adicionarNumero(2);
        somanumeros.adicionarNumero(3);

        System.out.println(somanumeros.calcularSoma());

        System.out.println(somanumeros.encontrarMaiorNumero());
        System.out.println(somanumeros.encontrarMenorNumero());


        somanumeros.exibirNumeros();

    }
}