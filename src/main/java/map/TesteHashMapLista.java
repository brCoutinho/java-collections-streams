package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteHashMapLista {
    public static void main(String[] args) {
        Map<Integer, List<String>> pedidos = new HashMap<>();
        List<String> produtos = new ArrayList<>();
        produtos.add("Macarrão");
        produtos.add("Peixe");
        produtos.add("Filé de Frango");
        pedidos.put(1,produtos);
        System.out.println(pedidos);

        for (Integer key : pedidos.keySet()){
            System.out.println(key + " -> " + pedidos.get(key));
        }
    }
}
