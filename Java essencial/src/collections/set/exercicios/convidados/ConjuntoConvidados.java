package collections.set.exercicios.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidado(int codigoConvite){

        Convidado convidadoPraRemover = null;
        for(Convidado convidados: convidados){
            if(convidados.getCodigoConvite() == codigoConvite){
                convidadoPraRemover = convidados;
                break;
            }
        }

        convidados.remove(convidadoPraRemover);

    }


    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }


    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();
        c.adicionarConvidado("Thiago 1",2933);
        c.adicionarConvidado("Thiago 2",2933);
        c.adicionarConvidado("Thiago 3",2943);
        c.adicionarConvidado("Thiago 4",2943);

        c.removerConvidado(293);


        System.out.println("Convidados: " + c.contarConvidados());

        c.exibirConvidados();


    }
}
