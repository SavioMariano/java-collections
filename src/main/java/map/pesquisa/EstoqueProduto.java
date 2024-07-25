package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributo
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProdutoMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for(Produto p: estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p: estoqueProdutoMap.values()){
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto p: estoqueProdutoMap.values()){
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
    
        // Exibe o estoque vazio
        estoque.exibirProduto();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1500.0, 1);
        estoque.adicionarProduto(2L, "Mouse", 25.0, 5);
        estoque.adicionarProduto(3L, "Monitor", 400.0, 10);
        estoque.adicionarProduto(4L, "Teclado", 40.0, 2);
        estoque.adicionarProduto(1L, "Notebook Gamer", 4500.0, 1);
    
        // Exibe os produtos no estoque
        estoque.exibirProduto();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        //Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        //System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }
}
