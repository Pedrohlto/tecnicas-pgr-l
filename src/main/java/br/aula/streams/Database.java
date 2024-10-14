package br.aula.streams;

import java.util.List;
import java.util.Optional;

public class Database {

    private List<Usuario> listaUsuarios = List.of(new Usuario(1, "Joseph", "joseph@gmail.com", "ATIVO")
            , new Usuario(2, "Maria", "maria@gmail.com", "INATIVO")
            , new Usuario(3, "Pedro", "pedro@gmail.com", "ATIVO"));

    public Optional<Usuario> findById(int idUsuario) {

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == idUsuario) {
                return Optional.of(usuario);
            }
        }
        return Optional.empty();
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
