package br.aula.lambda;

import java.time.LocalDate;
import java.util.function.Predicate;

public class LambdaExemplo {

    static int dobro = 3;

    public static void main(String[] args) {

        CadastroPessoa cadastro = new CadastroPessoa();

        cadastro.adicionarPessoa(new Pessoa("Pedro", "Henrique", LocalDate.of(1992, 5, 15), "Brasil", "99999999999", "Sao Paulo", "SP", "pedro@uol.com"));
        cadastro.adicionarPessoa(new Pessoa("Joao", "Paulo", LocalDate.of(1998, 8, 20), "Argentina", "99999999999", "Rio de Janeiro", "RJ", "joao@gmail.com"));
        cadastro.adicionarPessoa(new Pessoa("Maria", "Silva", LocalDate.of(2000, 9, 23), "Colombia", "99999999999", "Sao Paulo", "SP", "maria@hotmail.com"));
        cadastro.adicionarPessoa(new Pessoa("Jose", "Santos", LocalDate.of(2014, 10, 21), "Brasil", "99999999999", "Sao Paulo", "SP", "jose@yahoo.com"));

        var listaPessoas = cadastro.getPessoas();
        PrintTela print = new PrintTela();
        listaPessoas.forEach( (pessoa) -> System.out.println(pessoa.getNome() + " - " + pessoa.getEmail()));

        listaPessoas.removeIf((pessoa) -> pessoa.getEmail().contains("@gmail"));


    }
}
