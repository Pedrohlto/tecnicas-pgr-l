package br.aula.lambda;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public List<Pessoa> getListaFiltrada(Filtro filtro){
        List<Pessoa> listaFiltrada = new ArrayList<>();
        for(Pessoa pessoa : this.pessoas ){
            if(filtro.teste(pessoa)){
                listaFiltrada.add(pessoa);
            }
        }
        return listaFiltrada;
    }

}
