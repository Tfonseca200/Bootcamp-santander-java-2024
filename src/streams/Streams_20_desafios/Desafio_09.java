package streams.Streams_20_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Desafio_09 {

    /*
        Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificarNumerosDistintos = numeros.stream()
                        .distinct()
                                .count() != numeros.size();


        System.out.println("Tem numero repetitivo: " + verificarNumerosDistintos);
    }
}
