package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    
    private List<Item> carrinhoCompra;

    public CarrinhoCompra(){
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item i : carrinhoCompra){
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
        }
        carrinhoCompra.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item i : carrinhoCompra) {
            double valorItem =  i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }
    
    public void exibirItens(){
        System.out.println(carrinhoCompra);
    }   

    public static void main(String[] args) {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        carrinhoCompra.adicionarItem("Cortina", 25, 1);
        carrinhoCompra.adicionarItem("Tomada", 20, 3);
        carrinhoCompra.exibirItens();
        System.out.println(carrinhoCompra.calcularValorTotal());
    }
}
