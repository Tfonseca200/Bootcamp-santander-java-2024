package collections.map.exercicios.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class AgendaEventos {

    private Map<LocalDate,Evento> eventoMap;

    private AgendaEventos(){
        eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate date, String nomeEvento,String nomeAtracao){
        Evento evento = new Evento(nomeEvento,nomeAtracao);
        eventoMap.put(date,evento);
    }

    public void exibiAgenda(){
        // exibindo eventos em ordem crescente //
        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);

    }

    public void obterEventoProximo(){
       /* Set<LocalDate> dataSet = eventoMap.keySet();
        Collection<Evento> values = eventoMap.values(); */

        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Ordenando em formato crescente as chaves
        Map<LocalDate,Evento> eventoTreeMap = new TreeMap<>(eventoMap);


        // Achando o próximo evento com o método Entry
        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("Proximo evento: " + entry.getValue() +  "        data: "
                        + entry.getKey().format(formato));
                break;
            }

        }


    }


    public static void main(String[] args) {

        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2024,05,15), "Evento1", "Atração1");
        eventos.adicionarEvento(LocalDate.of(2024, Month.JULY,01), "Evento2", "Atração2");
        eventos.adicionarEvento(LocalDate.of(2024,Month.AUGUST,03), "Evento3", "Atração3");
        eventos.adicionarEvento(LocalDate.of(2024,Month.OCTOBER,10), "Evento4", "Atração4");

        eventos.exibiAgenda();

        eventos.obterEventoProximo();

    }

}
