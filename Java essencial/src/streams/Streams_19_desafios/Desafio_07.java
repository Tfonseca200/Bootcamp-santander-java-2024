package streams.Streams_19_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio_07 {

    /*

    Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

      Optional<Integer> primeiroNumeroMaior = numeros.stream()
                      .max(Integer::compareTo);


      if (primeiroNumeroMaior.isPresent()) {
          Optional<Integer> segundoNumeroMaior = numeros.stream()
                  .filter(n -> !n.equals(primeiroNumeroMaior.get()))
                  .max(Integer::compareTo);

          System.out.println(segundoNumeroMaior.get());

      }
    }

}

