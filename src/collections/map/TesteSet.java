package collections.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteSet {

    private Set<String> lista;

    public TesteSet(){
        this.lista = new HashSet<>();
    }

    public void adicionarNomes(String nome){
        lista.add(nome);
    }

    public void mostraNomes(){
        for(String nomes: lista){
             System.out.println(nomes);
        }
    }

    public void update(String nomeDalista,String nomePraAdicionar){
        if(!lista.isEmpty()){
            for(String nomes : lista){
                if (nomes.equalsIgnoreCase(nomeDalista)){

                }
            }
        }
    }


    public static void main(String[] args) {


    }
}
