package br.aula.lambda;

@FunctionalInterface
public interface Filtro {

    boolean teste(Pessoa pessoa);

}
