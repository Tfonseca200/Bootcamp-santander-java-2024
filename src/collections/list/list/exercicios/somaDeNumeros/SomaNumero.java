package collections.list.list.exercicios.somaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

    private List<Numero> numerosList;

    public SomaNumero(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numero(numero));
    }

    public int somaNumerosDaLista(){
        int soma = 0;
        if(!numerosList.isEmpty()){
            for (Numero numero : numerosList ){
                soma += numero.getNumero();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = numerosList.get(0).getNumero();

        if(!numerosList.isEmpty()){
            for(Numero numero : numerosList){
                if(numero.getNumero() >  maiorNumero){
                    maiorNumero = numero.getNumero();
                }
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = numerosList.get(0).getNumero();

        if(!numerosList.isEmpty()){
            for (Numero numero : numerosList ){
                if(numero.getNumero() < menorNumero){
                    menorNumero = numero.getNumero();
                }

            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        for (Numero numeros : numerosList){
            System.out.println("Numeros presente na lista : " + numeros.getNumero());
        }
    }


    public static void main(String[] args) {
        SomaNumero numeros = new SomaNumero();

        numeros.adicionarNumero(5);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(7);

        System.out.println("Encontra menor numero da lista: " + numeros.encontrarMenorNumero());

        System.out.println("Encontra maior numero da lista: " + numeros.encontrarMaiorNumero());
        System.out.println(numeros.somaNumerosDaLista());

        numeros.exibirNumeros();
    }
}
