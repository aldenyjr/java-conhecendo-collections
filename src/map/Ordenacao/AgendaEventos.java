package map.Ordenacao;

import map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
      // Set<LocalDate> dataSet = agendaEventosMap.keySet();
      //  Collections<Evento> values = agendaEventosMap.values();
      // agendaEventosMap.get()

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }

    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 26), "Evento 1", "Gustavo Lima");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 8), "Evento 2", "Jorge e Matheus");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Evento 3", "Pablo");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 30), "Evento 4", "Unha Pintada");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();



    }
}
