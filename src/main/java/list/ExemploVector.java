package list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Vôlei");
        esportes.add("Breakdance");

        esportes.get(3);

        System.out.println(esportes.get(0));
    }
}
