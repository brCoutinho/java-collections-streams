package set;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(7.0);
        notasAlunos.add(10.0);
        notasAlunos.add(8.5);
        notasAlunos.add(9.5);
        notasAlunos.add(3.0);
        notasAlunos.add(8.0);
        System.out.println(notasAlunos);

        notasAlunos.remove(7.0);

        System.out.println(notasAlunos);
        System.out.println(notasAlunos.size());

        for(Double notas : notasAlunos){
                System.out.println(notas);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}
