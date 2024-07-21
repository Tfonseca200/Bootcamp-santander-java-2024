package collections.map.exercicios.agendaDeContato;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaDeContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionaContato(String nome, int numero) {
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }


    public static void main(String[] args) {

        AgendaDeContato agendaDeContato = new AgendaDeContato();

        agendaDeContato.adicionaContato("thiago",111111111);
        agendaDeContato.adicionaContato("biro",22222222);
        agendaDeContato.adicionaContato("nelson",333333333);

        agendaDeContato.exibirContato();

        System.out.println(agendaDeContato.pesquisaPorNome("biro"));
    }
}