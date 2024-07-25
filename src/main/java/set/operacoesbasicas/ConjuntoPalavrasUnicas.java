package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        conjuntoPalavrasUnicas.remove(palavra);
    }

    public void verificarPalavra(String palavra){
        System.out.println(conjuntoPalavrasUnicas.contains(palavra));
    }
    
    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }
    
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("apple");
        conjunto.adicionarPalavra("banana");
        conjunto.adicionarPalavra("cherry");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("banana"); // true
        conjunto.verificarPalavra("grape"); // false

        conjunto.removerPalavra("banana");
        conjunto.exibirPalavrasUnicas();
    }
    

}