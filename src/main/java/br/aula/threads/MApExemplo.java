package br.aula.threads;

import java.util.HashMap;
import java.util.Map;

public class MApExemplo {

    public static void main(String[] args) {
        Map<String, Map<String, String>> maps = new HashMap<>();
        Map<String, String> mapSecundario = new HashMap<>();
        mapSecundario.put("Nome", "Pedro");
        maps.put("40414522890", mapSecundario);

        Map<String, String> stringStringMap = maps.get("40414522890");
        System.out.println(stringStringMap.get("Nome"));
    }

}
