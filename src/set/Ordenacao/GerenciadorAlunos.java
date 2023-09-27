package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunoSet.isEmpty()){
            for (Aluno aluno : alunoSet){
                if (aluno.getMatricula() == matricula){
                    alunoParaRemover = aluno;
                    alunoSet.remove(alunoParaRemover);
                    break;
                }
            }
            if (alunoParaRemover == null){
                System.out.println("Não há aluno com a Matricula: " + matricula);
            }
        } else {
            System.out.println("Não há alunos na lista!");
        }

    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new alunosPorNota());
        alunoPorNota.addAll(alunoSet);

        return alunoPorNota;
    }


    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        System.out.println("---------- Adicionando Alunos ----------");
        gerenciadorAlunos.adicionarAluno("Marcelo Freitas", 20230001L, 9.49d);
        gerenciadorAlunos.adicionarAluno("Aldeny Junior", 20230002L, 7.59d);
        gerenciadorAlunos.adicionarAluno("Vando Paulo", 20230002L, 7.99d);
        gerenciadorAlunos.adicionarAluno("Silvana Merces", 20230003L, 9.59d);
        gerenciadorAlunos.adicionarAluno("Oto Sales", 20230005L, 6.59d);
        System.out.println(gerenciadorAlunos.alunoSet);

        System.out.println("---------- Removendo Aluno ----------");
        gerenciadorAlunos.removerAluno(20230003L);
        System.out.println(gerenciadorAlunos.alunoSet);

        System.out.println("---------- Ordenando Por Nome ----------");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("---------- Ordenando Por Nota ----------");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());






    }
}
