package comparator;

import entidade.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTeste {
    public static void main(String[] args) {
        Pessoa elaine = new Pessoa();
        elaine.setNome("Elaine");
        elaine.setIdade("30");

        Pessoa leandro = new Pessoa();
        leandro.setNome("Leandro");
        leandro.setIdade("37");

        Pessoa silvana = new Pessoa();
        silvana.setNome("Silvana");
        silvana.setIdade("31");

        Pessoa felipe = new Pessoa();
        felipe.setNome("Felipe");
        felipe.setIdade("31");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(elaine);
        pessoas.add(leandro);
        pessoas.add(silvana);
        pessoas.add(felipe);

        //Usando o sort para ordenar a lista de acordo com o comparator passado (Ordem por nome)
        System.out.println("Usando o sort para ordenar a lista de acordo com o comparator passado");

        pessoas.sort(((o1, o2) -> o1.getNome().compareTo(o2.getNome())));
        System.out.println("Sem referencia ao metodo: " + pessoas);

        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println("Com referencia ao metodo: " + pessoas);

        pessoas.stream().sorted(Comparator.comparing(Pessoa::getIdade));
        System.out.println("Usando o sorted para ordenar por idade: " + pessoas);
    }
}
