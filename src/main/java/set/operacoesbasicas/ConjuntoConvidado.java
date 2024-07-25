package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite ) {
                convidadoRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoConvidados
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();
    
        // Exibindo o número de convidados no conjunto (deve ser zero)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1234);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);
    
        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();
    
        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
    
        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
    
        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
      }

}
