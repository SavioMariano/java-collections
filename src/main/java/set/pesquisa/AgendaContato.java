package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatoNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) { //adiciona os nomes que começam com "nome".
                contatoNome.add(contato);
            }
        }
        return contatoNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
    AgendaContato agendaContatos = new AgendaContato();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContato();

    // Adicionando contatos à agenda
    agendaContatos.adicionarContato("Maria", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    // Exibindo os contatos na agenda
    agendaContatos.exibirContato();

    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos.pesquisarNome("Maria"));

    // Atualizando o número de um contato
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContato();
  
    }
}
