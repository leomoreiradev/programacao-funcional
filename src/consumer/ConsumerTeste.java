package consumer;

import entidade.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ConsumerTeste {
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

        //Sem retorno VOID Executa esta operação no argumento fornecido.

        System.out.println("------------------------------------------------------");
        pessoas.forEach(pessoa -> pessoa.setNome(pessoa.getNome().toUpperCase()));
        pessoas.forEach(System.out::println);

        System.out.println("------------------------------------------------------");
        pessoas.forEach(pessoa -> pessoa.setIdade(pessoa.getIdade().concat( " - anos")));
        pessoas.forEach(System.out::println);



    }
}
