import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Elaine", "Leandro", "Karini"));
        Consumer<String> nomesConsumer0 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.concat(" - Usando o new"));
            }
        };

        nomes.forEach(nomesConsumer0);

        Consumer<String> nomesConsumer = s -> System.out.println(s);
        nomes.forEach(nomesConsumer);
        nomes.forEach( s -> System.out.println(s.concat(";")));


        nomes.stream()
                .map(nome -> nome.toUpperCase())
                .filter(f -> f.contains("L"))
                .map(m -> m.replace("L", "X"))
                .filter(f2 -> f2.contains("X"))
                .forEach(System.out::println);

        int numero1 = 5;

        Predicate<Integer> numero2 = s -> s > numero1;
        System.out.println(numero2.test(10));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        System.out.println(doubleBinaryOperator.applyAsDouble(2,3));










    }
}
