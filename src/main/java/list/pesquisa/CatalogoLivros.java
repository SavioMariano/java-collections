package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroLista;

    public CatalogoLivros() {
        this.livroLista = new ArrayList<>();    
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroLista.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livroAutorLista = new ArrayList<>();
        if (!livroLista.isEmpty()) {
            for (Livro livro : livroLista) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livroAutorLista.add(livro);
                }       
            }   
        }
        return livroAutorLista; 
    }

    public List<Livro> pesquisarIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroAnosLista = new ArrayList<>();
        if (!livroLista.isEmpty()) {
            for (Livro livro : livroLista) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal ) {
                    livroAnosLista.add(livro);
                }
            }
        }
        return livroAnosLista;
    }

    public Livro pesquisarTitulo(String titulo){
        Livro livroTitulo = null;

        if (!livroLista.isEmpty()) {
            for (Livro livro : livroLista) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroTitulo = livro;
                    break;
                }
            }
        }
        return livroTitulo;
    }
    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();
    
        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2022);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    
        // Exibindo livros pelo mesmo autor
        System.out.println(catalogoLivros.pesquisarAutor("Robert C. Martin"));
    
        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(catalogoLivros.pesquisarAutor("Autor Inexistente"));
    
        // Exibindo livros dentro de um intervalo de anos
        System.out.println(catalogoLivros.pesquisarIntervaloAnos(2010, 2022));
    
        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(catalogoLivros.pesquisarIntervaloAnos(2025, 2030));
    
        // Exibindo livros por título
        System.out.println(catalogoLivros.pesquisarTitulo("Java Guia do Programador"));
    
        // Exibindo livros por título (caso em que não há livros com o título especificado)
        System.out.println(catalogoLivros.pesquisarTitulo("Título Inexistente"));
      }
}

