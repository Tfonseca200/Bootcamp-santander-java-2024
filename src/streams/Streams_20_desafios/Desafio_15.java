package streams.Streams_20_desafios;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio_15 {

    /*

    Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         List<Integer> NumerosNegativos = numeros.stream()
                        .filter(n -> n < 0)
                 .collect(Collectors.toList());

        if(!NumerosNegativos.isEmpty()){
            System.out.println("tem numeros negativos: " + NumerosNegativos);
        }else {
            System.out.println("Não tem numeros negativos");
        }



    }


}
