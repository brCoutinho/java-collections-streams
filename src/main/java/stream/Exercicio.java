package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Limão");

        System.out.println(frutas.stream().anyMatch(fruta -> fruta.contains("X")));

    }
}
