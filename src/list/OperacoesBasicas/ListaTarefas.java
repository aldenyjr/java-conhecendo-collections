package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {

    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Numero total de Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("Numero total de Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("Numero total de Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
