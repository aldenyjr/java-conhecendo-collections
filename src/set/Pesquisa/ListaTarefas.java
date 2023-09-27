package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = tarefa;
                    tarefaSet.remove(tarefaParaRemover);
                    break;
                } else {
                    System.out.println("Não há uma tarefa com essa descrição!");
                }
            }
        } else {
            System.out.println("Não há tarefas na lista de Tarefas!");
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasSetConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet){
            if (tarefa.isConcluida()){
                tarefasSetConcluidas.add(tarefa);
            }
        }
        return tarefasSetConcluidas;
    }


    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasSetPendentes = new HashSet<>();
        for(Tarefa tarefa : tarefaSet){
            if(!tarefa.isConcluida()){
                tarefasSetPendentes.add(tarefa);
            }
        }
        return tarefasSetPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setConcluida(true);
                    break;
                }
            }
        } else {
            System.out.println("Não há tarefas na lista de Tarefas!");
        }

    }

    public void marcarTarefaPendente(String decricao){
        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet){
                if (tarefa.getDescricao().equalsIgnoreCase(decricao) && tarefa.isConcluida()){
                    tarefa.setConcluida(false);
                }
            }
        } else {
            System.out.println("Não há tarefas na lista de Tarefas!");
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar JavaScript");

        System.out.println();
        listaTarefas.exibirTarefas();
        System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas Concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Estudar Java");

        System.out.println();
        listaTarefas.exibirTarefas();
        System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas Concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Estudar Java");

        System.out.println();
        listaTarefas.exibirTarefas();
        System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas Concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        System.out.println();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
        System.out.println("Total de Tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas Concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

    }

}
