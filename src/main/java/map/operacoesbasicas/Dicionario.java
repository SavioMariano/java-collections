package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao); //tanto adiciona tanto quanto atualiza.
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public String pesquisarPalavra(String palavra){
        String palavraEncontrada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraEncontrada = dicionarioMap.get(palavra);           
        }
        return palavraEncontrada;
    }

    public void exibirPalavra(){
        System.out.println(dicionarioMap);
    }

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Careca", "Falta de cabelo na cabeça");
        dicionario.adicionarPalavra("Violão", "Instrumento utilizado para tocar");
        dicionario.adicionarPalavra("Cueca", "Vestimenta intima");

        dicionario.exibirPalavra();

        dicionario.removerPalavra("Careca");

        dicionario.exibirPalavra();

        System.out.println(dicionario.pesquisarPalavra("Cueca"));

    }
}

