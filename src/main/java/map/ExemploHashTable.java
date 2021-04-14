package map;

import java.util.Hashtable;

public class ExemploHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> estudantes = new Hashtable<>();
        estudantes.put("Joseph",21);
        estudantes.put("Mário", 23);
        estudantes.put("Paulo", 22);
        estudantes.put("Fernando", 22);
        System.out.println(estudantes);
    }
}
