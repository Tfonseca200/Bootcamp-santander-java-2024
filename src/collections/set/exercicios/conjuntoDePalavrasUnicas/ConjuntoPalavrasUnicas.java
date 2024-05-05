package collections.set.exercicios.conjuntoDePalavrasUnicas;

import java.util.Collections;
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
        PalavrasUnicas palavraPraRemover = new PalavrasUnicas(palavra);
        for(PalavrasUnicas palavras : palavrasList){
            if(palavras.equals(palavra)){
                palavraPraRemover = palavras;
                break;
            }
        }
        palavrasList.remove(palavraPraRemover);
    }

    public void verificarPalavra(String palavra){

        /* falta corrigir método */

        for (PalavrasUnicas palavras : palavrasList) {
            if (palavras.getPalavrasUnicas().equalsIgnoreCase(palavra)) {
                System.out.println("Palavra presente na lista");
                break;
            }else{
                System.out.println("Palavra não presente na lista");
                break;
            }
        }
    }



        public void exibirPalavrasUnicas(){
        System.out.println(palavrasList);
    }


    public static void main(String[] args) {
        ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();

        c.adiocinarPalavra("Diego");
        c.adiocinarPalavra("Thiago");


        c.exibirPalavrasUnicas();

        c.removerPalavra("Thiago");


        c.exibirPalavrasUnicas();
        c.adiocinarPalavra("Thiago");

        c.exibirPalavrasUnicas();
        c.verificarPalavra("Thiago");




    }
}
