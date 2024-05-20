package streams.Streams_20_desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio_14 {

    /*
    Desafio 14 - Encontre o maior número primo da lista:
    Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(n -> isPrimo(n))
                .max(Comparator.naturalOrder());

        System.out.println("Maior numero primo da lista: " + maiorNumeroPrimo.get());


    }

    public static boolean isPrimo(int n){

        if(n <= 1){
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

         return true;
        }
}