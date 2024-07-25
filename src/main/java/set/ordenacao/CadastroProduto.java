package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoNome(){
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return produtosNome;
    }

    public Set<Produto> exibirProdutoPreco(){
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPreco());
        produtosPreco.addAll(produtoSet);
        return produtosPreco;
    }

    public Set<Produto> exibirProdutoQuantidade(){
        Set<Produto> produtosQuantidade = new TreeSet<>(new ComparatorQuantidade());
        produtosQuantidade.addAll(produtoSet);
        return produtosQuantidade;
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProduto cadastroProdutos = new CadastroProduto();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);
    
        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutoNome());
    
        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirProdutoPreco());
         
        // Exibindo produtos ordenados por quantidade
        System.out.println(cadastroProdutos.exibirProdutoQuantidade());

      }
}