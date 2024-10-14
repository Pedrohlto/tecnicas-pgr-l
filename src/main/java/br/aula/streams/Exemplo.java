package br.aula.streams;

import java.util.Optional;

public class Exemplo {

    public static void main(String[] args) {
        Database db = new Database();
        Optional<Usuario> byId = db.findById(2);

//        if (byId.isPresent()) {
//            Usuario usuario = byId.get();
//            System.out.println(usuario.getNome());
//        }
//        byId.ifPresent(usuario ->{
//            System.out.println(usuario.getNome());
//        });

        //byId.orElse(new Usuario(2, "Maria", "maria@gmail.com", "INATIVO"));
        byId.orElseThrow(() ->{
            throw new RuntimeException("Erro usuario não existe");
        });






    }
}
