package set;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);
        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais.last());
        //Retorna primeira abaixo da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));
        //Retorna primeira acima da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais.pollLast());
        System.out.println(treeCapitais);

        for(String capital : treeCapitais){
            System.out.println(capital);
        }
    }
}
