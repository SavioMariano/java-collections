package main.java.list.operacoesbasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescriçao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }       
     
    
}
