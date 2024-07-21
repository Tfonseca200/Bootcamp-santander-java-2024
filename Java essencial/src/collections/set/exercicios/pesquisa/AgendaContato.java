package collections.set.exercicios.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
       contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public  Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contatos : contatoSet){
            if (contatos.getNome().startsWith(nome)){
                contatosPorNome.add(contatos);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numeroNovo){
        Contato contatoAtualizado = null;
        for(Contato contatos : contatoSet){
            if(contatos.getNome().equalsIgnoreCase(nome)){
                contatos.setNumero(numeroNovo);
                contatoAtualizado = contatos;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {

        AgendaContato contato = new AgendaContato();
        contato.adicionarContato("Thiago1",283124739);
        contato.adicionarContato("Thiago2",646247349);
        contato.adicionarContato("Thiago3",237446733);
        contato.adicionarContato("Thiago4",297735832);
        contato.adicionarContato("Thiago5",283823738);

        contato.exibirContatos();

        System.out.println(contato.pesquisaPorNome("Thiago1"));

        System.out.println(contato.atualizarNumeroContato("Thiago1",1111111111));

        contato.exibirContatos();


    }



}
