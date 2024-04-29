package collections.list.list.exercicios.listaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {

    private List<Tarefa> listTarefa= new ArrayList<Tarefa>();


    public ListaDeTarefa(){

        this.listTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);

            }
        }

        listTarefa.removeAll(tarefasParaRemover);
    }


    public int obterTotalDeTarefas(){
        return listTarefa.size();
    }

    public void obterDescricoesDeTarefas(){
        System.out.println(listTarefa);
    }
}
