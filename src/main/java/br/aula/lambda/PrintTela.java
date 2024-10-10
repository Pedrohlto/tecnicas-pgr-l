package br.aula.lambda;

import java.util.function.Consumer;

public class PrintTela implements Consumer<Pessoa> {
    @Override
    public void accept(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " - " + pessoa.getEmail());
    }
}
