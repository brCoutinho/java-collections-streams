package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Jonas");
        estudantes.add("Wilson");
        estudantes.add("Mauricio");
        estudantes.add("Douglas");
        estudantes.add("Juliane");
        estudantes.add("Marcia");
        estudantes.add("Rosana");

        //Retorna a contagem de elementos
        System.out.println("Contagem: " + estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior número de letras: " + estudantes.stream().max(
                Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Menor número de letras: " + estudantes.stream().min(
                Comparator.comparingInt(String::length)));

        //Retorna o elemento que tem "r" no nome
        System.out.println("Com a letra R: " + estudantes.stream().filter((estudante) ->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        //Map: recebe uma coleção e transforma em outra coleção do mesmo tamanho fazendo a alteração necessária
        System.out.println("Nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna os 3 primeiros elementos com o método limit
        System.out.println("Retorna os 3 primeiros: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento no console sem retornar outra coleção - PEEK
        System.out.println("Retorna os mesmos elementos: " + estudantes.stream().peek(System.out::println).
                collect(Collectors.toList()
        ));

        //Exibe cada elemento no console sem retornar outra coleção - FOREACH
        System.out.println("Retorna os elementos novamente");
        estudantes.stream().forEach(System.out::println);

        //Retorna boolean se todos elementos possuírem "W" no nome
        System.out.println("Todos contém W no nome? " + estudantes.stream().allMatch(elemento ->
                elemento.contains("W")));

        //Retorna boolean se algum dos elementos possuir "A" no nome
        System.out.println("Algum contém A no nome? " + estudantes.stream().anyMatch(elemento ->
                elemento.contains("a")));

        //noneMatch - contrário de anymatch
        System.out.println("Nenhum não contém A no nome? " + estudantes.stream().noneMatch(elemento ->
                elemento.contains("a")));

        //Retorna o primeiro elemento da coleção
        System.out.println("Primeiro elemento");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de encadeamento
        System.out.println("Operação encadeada");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante ->
                        estudante.toLowerCase().contains("r"))
        //        .collect(Collectors.toList()));
        //        .collect(Collectors.joining(", ")));
        //        .collect(Collectors.toSet()));
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));
    }
}
