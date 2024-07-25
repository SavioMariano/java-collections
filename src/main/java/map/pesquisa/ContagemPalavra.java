package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    //atributo
    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavra(){
        contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer quantidade){
        contagemPalavraMap.put(palavra, quantidade);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavraMap.isEmpty()) {
            contagemPalavraMap.remove(palavra);
        }else{
            System.out.println("O map está vazio.");
        }
    }

    public int exibirContagemPalavra(){
        int contagemTotal = 0;
        for (int contagem : contagemPalavraMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int contagem = 0;
        for (Map.Entry<String, Integer> entry: contagemPalavraMap.entrySet()) {
            if (entry.getValue() > contagem) {
                contagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente;
        
    }

    public static void main(String[] args) {
        ContagemPalavra contagemLinguagens = new ContagemPalavra();
    
        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);
    
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavra() + " palavras.");
    
        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
      }

}