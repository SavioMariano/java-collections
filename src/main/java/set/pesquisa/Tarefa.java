package main.java.set.pesquisa;

public class Tarefa {
    //atributo
    private String descricao;
    private boolean estado;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.estado = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }
    
}
