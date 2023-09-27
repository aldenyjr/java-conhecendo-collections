package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Não a contato na Lista MAP");
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 111111111);
        agendaContatos.adicionarContato("Aldeny Junior", 981881340);
        agendaContatos.adicionarContato("Aldeny Junior", 977777777);
        agendaContatos.adicionarContato("Aldeny Jr", 988888888);
        agendaContatos.adicionarContato("Aldeny Jr", 988888888);
        agendaContatos.exibirContato();

        agendaContatos.removerContato("Joao");
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Aldeny Jr"));

    }
}
