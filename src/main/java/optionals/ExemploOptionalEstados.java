package optionals;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {
        //Se passar null como argumento terá uma excessão
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Presente ou não");
        optionalString.ifPresentOrElse(System.out::println,() -> System.out.println("Não está presente"));

        //Recebe o valor caso esteja null retornará o segundo argumento
        //Caso seja <> de null retornará o que consta
        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Segundo teste");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));


        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Optional empty");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
    }
}
