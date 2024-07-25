package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    //Atributo
    List<Integer> listaInteiros;

    public OrdenacaoNumeros() {
        this.listaInteiros = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> novaListaInteiros = new ArrayList<>(listaInteiros);
        Collections.sort(novaListaInteiros);
        return novaListaInteiros;
    }

    
    public List<Integer> ordenarDescendente(){
        List<Integer> novaListaInteiros = new ArrayList<>(listaInteiros);
        Collections.sort(novaListaInteiros, Collections.reverseOrder());
        return novaListaInteiros;
    }

    public void exibirNumeros(){
        System.out.println(listaInteiros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println(ordenacaoNumeros.ordenarDescendente());
        
    }
}