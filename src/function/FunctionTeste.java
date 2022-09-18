package function;

import entidade.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class FunctionTeste {
    public static void main(String[] args) {
        Pessoa elaine = new Pessoa();
        elaine.setNome("Elaine");
        elaine.setIdade("30");

        Pessoa leandro = new Pessoa();
        leandro.setNome("Leandro");
        leandro.setIdade("37");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(elaine);
        pessoas.add(leandro);

        pessoas.stream()
                .map(pessoa -> pessoa.getNome().concat(" Oliveira")).forEach(System.out::println);
    }
}
