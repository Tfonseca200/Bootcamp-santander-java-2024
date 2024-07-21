package streams.Streams_19_desafios;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/*

Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

 */

public class Desafio_05 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDoNumerosMaioresCinco = numeros.stream()
                        .filter(n -> n >= 5)
                        .mapToInt(Integer::intValue)
                        .sum();


        long size = numeros.stream()
                .filter(n -> n >= 5)
                .count();

        double mediaDosNumerosMaioresQue5 = (double) somaDoNumerosMaioresCinco / size;


        System.out.printf("%.2f" , mediaDosNumerosMaioresQue5);
    }
}
