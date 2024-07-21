package streams.Streams_19_desafios;

import java.util.*;
import java.util.stream.Collectors;

public class Desafio_18 {

/*
    Desafio 18 - Verifique se todos os números da lista são iguais:
    Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

 */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Set<Integer> numbers = new HashSet<>();

        Set<Integer> numerosDuplicados = numeros.stream()
                .filter(n -> !numbers.add(n))
                .collect(Collectors.toSet());


        if (!numerosDuplicados.isEmpty()) {
            System.out.println("Numeros duplicados: " + numerosDuplicados);
        } else {
            System.out.println("Não tem numeros duplicados");
        }
    }
}
