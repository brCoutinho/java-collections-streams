package optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {
    public static void main(String[] args) {
        System.out.println("Valor inteiro");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("Valor decimal");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        Long valorLong = 23L;
        System.out.println("Valor long");
        OptionalLong.of(valorLong).ifPresent(System.out::println);
    }
}
