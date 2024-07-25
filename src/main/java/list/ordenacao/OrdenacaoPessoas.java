package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    List<Pessoa> listaPessoa;

    public OrdenacaoPessoas() {
        this.listaPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoaIdade = new ArrayList<>(listaPessoa);
        Collections.sort(pessoaIdade);
        return pessoaIdade;
    }

    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoaALtura = new ArrayList<>(listaPessoa);
        Collections.sort(pessoaALtura, new ComparatorAltura());

        return pessoaALtura;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
          OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
      
          // Adicionando pessoas à lista
          ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
          ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
          ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
          ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);
      
          // Exibindo a lista de pessoas adicionadas
          System.out.println(ordenacaoPessoas.listaPessoa);
      
          // Ordenando e exibindo por idade
          System.out.println(ordenacaoPessoas.ordenarIdade());
      
          // Ordenando e exibindo por altura
          System.out.println(ordenacaoPessoas.ordenarAltura());
        }
}
