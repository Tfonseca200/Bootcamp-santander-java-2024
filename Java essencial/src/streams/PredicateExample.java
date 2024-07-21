package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/* Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 É comumente usada para filtrar os elementos do Stream com base em alguma condição. */

// muito bom pra condições


public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<String> palavras = Arrays.asList("Java", "Kotlin" , "Python", "Javascript", "c", "go", "ruby");

        // Usar o Predicate com expressão lambda para filtrar números pares
        // Predicate<String> maisDeCincoCaracter = palavra -> palavra.length() < 5;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        palavras.stream()
                .filter( p -> p.length() > 5)
                .forEach(System.out::println);



    }
}