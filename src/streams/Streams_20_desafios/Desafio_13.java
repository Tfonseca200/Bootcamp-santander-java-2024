package streams.Streams_20_desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Desafio_13 {

    /*
    Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int inicio = 1;
        int fim = 10;

        Stream<Integer> intevaloDeNumeros = numeros.stream()
                        .sorted()
                        .distinct()
                        .skip(inicio - 1)
                        .limit(fim - inicio + 1);


        intevaloDeNumeros.forEach(n-> System.out.println(n));

    }
}
