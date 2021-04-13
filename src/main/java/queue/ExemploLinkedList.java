package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("João");
        filaBanco.add("Otávio");
        filaBanco.add("Felipe");
        filaBanco.add("Valdemir");
        System.out.println(filaBanco);

        var clienteASerAtendido = filaBanco.poll();

        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        var primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);

    }
}
