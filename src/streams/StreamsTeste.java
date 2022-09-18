package streams;

import entidade.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTeste {
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

        //Usando o limite para retornar apenas o valor especificado no limit
        System.out.println("Usando o limite para retornar apenas o valor especificado no limit");
        pessoas.stream().limit(2).forEach(System.out::println);

        //Usando o filter para retornar apenas o valor de acordo com o predicade recebido
        System.out.println("Usando o filter para retornar apenas o valor de acordo com o predicade recebido");
        pessoas.stream().filter(pessoa -> pessoa.getNome().contains("S")).forEach(System.out::println);

        //Usando o map para tranformar os valores de acordo com a function passada como parametro
        System.out.println("Usando o map para tranformar os valores de acordo com a function passada como parametro");
        pessoas.stream().map(pessoa -> pessoa.getNome().concat(" - familia")).forEach(System.out::println);








    }
}
