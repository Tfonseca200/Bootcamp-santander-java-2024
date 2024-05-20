package streams.Streams_20_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_17 {

    /*
     Desafio 17 - Filtrar os números primos da lista:
    Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> isPrimo(n))
                .collect(Collectors.toList());

        numerosPrimos.forEach(System.out::println);

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
