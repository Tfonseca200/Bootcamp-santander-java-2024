package collections.set.exercicios.conjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<PalavrasUnicas> palavrasList;

    public ConjuntoPalavrasUnicas(){
        this.palavrasList = new HashSet<>();
    }


    public void adiocinarPalavra(String palavra){
        palavrasList.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        PalavrasUnicas palavraObj = new PalavrasUnicas(palavra);
        for(PalavrasUnicas palavras : palavrasList){
            if(palavras.equals(palavra)){
                palavraObj = palavras;
                break;
            }
        }
        palavrasList.remove(palavraObj);
    }

    public void verificarPalavra(PalavrasUnicas palavra){

        for(PalavrasUnicas palavras : palavrasList){
            if(palavras.equals(palavra)){
                System.out.println("Palavra presente na lista!");
                break;
            }else{
                System.out.println("Palavra não presente na lista!");
                break;
            }
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasList);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();

        c.adiocinarPalavra("Thiago");
        c.adiocinarPalavra("Diego");

        c.exibirPalavrasUnicas();

        PalavrasUnicas u = new PalavrasUnicas("Thiago");

        c.verificarPalavra(u);
    }
}
