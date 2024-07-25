package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    //atributo
    private Set<Tarefa> tarefaSet;

    public ListaTarefa(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = tarefa;
                    break;
                }
            }
        }
        tarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefa(){
        System.out.println(tarefaSet);
    }

    public int contarTarefa(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefaConcluida(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isStatus() == true) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefaPendente(){
        Set<Tarefa> tarefaPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isStatus() == false) {
                tarefaPendentes.add(tarefa);
            }
        }
        return tarefaPendentes;    
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaMarcada = null;
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setEstado(true);
                tarefaMarcada = tarefa;
                break;
            }
        }
        return tarefaMarcada;
    }
    
    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaMarcada = null;
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setEstado(false);
                tarefaMarcada = tarefa;
                break;
            }
        }
        return tarefaMarcada;
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefa listaTarefas = new ListaTarefa();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefa();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefa();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefa());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefaPendente());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefaConcluida());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefa();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefa();
      }

}
