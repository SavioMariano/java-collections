package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone); // tanto adiciona tanto quanto atualiza.
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public Integer pesquisarNome(String nome){
        Integer numeroNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroNome = agendaContatoMap.get(nome);
        }
        return numeroNome;
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
    
        agendaContatos.exibirContato();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContato();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarNome(nomePesquisa);
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
      }
}
