package streams.Streams_19_desafios;

import java.util.List;
import java.util.Arrays;

/*

Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

*/
public class Desafio_02 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println("Soma dos numero pares da lista usando strems: " + somaDosNumerosPares);

    }
}
