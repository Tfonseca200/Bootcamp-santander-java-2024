package streams.Streams_19_desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio_10 {

    /*
    Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

     */

    public static void main(String[] args) {

         List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> resultadosNumeros = numeros.stream()
                .filter(n -> n % 2 == 1)
                //filtrando multiplos de 3 e 5, múltiplos são numeros que que dividindo por um numero especifico não sobra resto da divisão //
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        resultadosNumeros.forEach(System.out::println);


    }
}
