package map;

import java.util.Iterator;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();
        //Monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");

        System.out.println(treeCapitais);
        System.out.println(treeCapitais.firstKey());
        System.out.println(treeCapitais.lastKey());
        System.out.println(treeCapitais.lowerKey("RS"));
        System.out.println(treeCapitais.firstEntry().getKey() + " - " + treeCapitais.firstEntry().getValue());

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }
    }
}
