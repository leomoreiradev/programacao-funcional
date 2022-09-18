package predicate;

import entidade.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PredicateTeste {
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

        //Retorna um boolean (verifica se o predicado passado retorna true ou false)
        pessoas.removeIf(pessoa -> pessoa.getNome().contains("d"));

        pessoas.forEach(System.out::println);






    }

}
