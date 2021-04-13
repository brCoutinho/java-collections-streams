package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João Félix");
        nomes.add("Rafael Leão");
        nomes.add("João Cancelo");
        nomes.add("Ruben Neves");
        nomes.add("Bernardo Silva");
        nomes.set(2,"Figo");
        System.out.println(nomes);

        Collections.sort(nomes);//Ordenação
        System.out.println(nomes);

        nomes.remove(1);
        System.out.println(nomes);
        nomes.remove("Ruben Neves");
        System.out.println(nomes);

        var primeiroNome = nomes.get(0);
        System.out.println(primeiroNome);

        var temEsseNome = nomes.contains("Thiago");
        System.out.println(temEsseNome);
    }
}
