package br.aula.estruturaDados;

import java.util.*;

public class ListExemplo {

    public static void main(String[] args) {
        Map<String, Carro> map = new HashMap<>();
        Carro carroDoPedro = new Carro();
        carroDoPedro.setMarca("VW");
        carroDoPedro.setPlaca("ABC-9863");
        carroDoPedro.setNome("GOL");

        map.put("Carro do Pedro", carroDoPedro);
        var carro = map.get("Carro do Pedro");

        System.out.println(carro.getNome());
    }
}
