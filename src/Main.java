import Estudos.Collections.List.OperacoesBasicas.ListaDeTarefa;
import Estudos.Collections.List.OperacoesBasicas.Tarefa;

import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {


        Tarefa t = new Tarefa("livro absoluto da mente");
        Tarefa h = new Tarefa("livro zero a pro");
        Tarefa i = new Tarefa("livro java 8");

        ListaDeTarefa listaDeTarefa = new ListaDeTarefa();

        System.out.println(listaDeTarefa.obterTotalDeTarefas());

        listaDeTarefa.adicionarTarefa("livro absoluto da mente");
        listaDeTarefa.adicionarTarefa("livro zero a pro");
        listaDeTarefa.adicionarTarefa("livro java 8");

        System.out.println("total de tarefas: " + listaDeTarefa.obterTotalDeTarefas());

        listaDeTarefa.removerTarefa("livro zero a pro");
        System.out.println("total de tarefas: " + listaDeTarefa.obterTotalDeTarefas());

        listaDeTarefa.obterDescricoesDeTarefas();






    }
}