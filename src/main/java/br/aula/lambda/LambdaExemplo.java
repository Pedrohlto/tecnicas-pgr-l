package br.aula.lambda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Function;

public class LambdaExemplo {

    static int dobro = 3;

    public static void main(String[] args) {

        CadastroPessoa cadastro = new CadastroPessoa();

        cadastro.adicionarPessoa(new Pessoa("Pedro", "Henrique", LocalDate.of(1992, 5, 15), "Brasil", "99999999999", "Sao Paulo", "SP", "pedro@uol.com"));
        cadastro.adicionarPessoa(new Pessoa("Joao", "Paulo", LocalDate.of(1998, 8, 20), "Argentina", "99999999999", "Rio de Janeiro", "RJ", "joao@gmail.com"));
        cadastro.adicionarPessoa(new Pessoa("Maria", "Silva", LocalDate.of(2000, 9, 23), "Colombia", "99999999999", "Sao Paulo", "SP", "maria@hotmail.com"));
        cadastro.adicionarPessoa(new Pessoa("Jose", "Santos", LocalDate.of(2014, 10, 21), "Brasil", "99999999999", "Sao Paulo", "SP", "jose@yahoo.com"));

        var pessoas = cadastro.getPessoas();

        //pessoas.removeIf(pessoa -> pessoa.getEstado().equalsIgnoreCase("SP"));
        pessoas.removeIf(pessoa -> ChronoUnit.YEARS.between(pessoa.getDataNascimento(), LocalDate.now()) >= 18);

        pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));

        Function<String, Pessoa> funcao = (String nome) -> {
            return new Pessoa(nome, "Henrique", LocalDate.of(1992, 5, 15), "Brasil", "99999999999", "Sao Paulo", "SP", "pedro@uol.com");
        };


        System.out.println(pessoas);
        /*Filtro filtro = (Pessoa pessoa) -> {return ChronoUnit.YEARS.between(pessoa.getDataNascimento(), LocalDate.now()) >= 18;};
        var novaLista = cadastro.getListaFiltrada(filtro);
        System.out.println(novaLista);



        var novaListaSp = cadastro.getListaFiltrada((Pessoa pessoa) -> {return pessoa.getEstado().equalsIgnoreCase("SP");});
        System.out.println(novaListaSp);*/

//        var novaListaSp = cadastro.getListaFiltrada(new Filtro() {
//            @Override
//            public boolean teste(Pessoa pessoa) {
//                return pessoa.getEstado().equalsIgnoreCase("SP");
//            }
//
//            @Override
//            public String nome(Pessoa pessoa) {
//                return "";
//            }
//        });



    }
}
