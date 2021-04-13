package set;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        //Fila
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(5);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(16);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(2);
        System.out.println(sequenciaNumerica);

        for (Integer numero:
             sequenciaNumerica) {
            System.out.println(numero);
        }
    }
}
