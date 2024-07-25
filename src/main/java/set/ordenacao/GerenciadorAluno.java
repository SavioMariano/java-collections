package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {
    //atributo
    private Set<Aluno> alunoSet;

    public GerenciadorAluno() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        for (Aluno aluno : alunoSet) {
            if (aluno.getMatricula() == matricula) {
                alunoRemover = aluno;
            }
        }
        alunoSet.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunoNome(){
        Set<Aluno> alunoNome = new TreeSet<>(alunoSet);
        return alunoNome;
    }
    
    public Set<Aluno> exibirAlunoNota(){
        Set<Aluno> alunoNota = new TreeSet<>(new ComparatorNota());
        alunoNota.addAll(alunoSet);
        return alunoNota;
    }
    
    public void exibirAluno(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAluno gerenciadorAluno = new GerenciadorAluno();

        gerenciadorAluno.adicionarAluno("Pedro", 509356, 5);
        gerenciadorAluno.adicionarAluno("João", 493067, 8);
        gerenciadorAluno.adicionarAluno("Ana", 485067, 2);
        gerenciadorAluno.adicionarAluno("Maria", 810609, 3);

        System.out.println("Alunos na ordem natural:");
        gerenciadorAluno.exibirAluno();

        System.out.println("Alunos ordenados por nome:");
        System.out.println(gerenciadorAluno.exibirAlunoNome());
        
        System.out.println("Alunos ordenados por nota:");
        System.out.println(gerenciadorAluno.exibirAlunoNota());

    }
}
