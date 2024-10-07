package br.aula.streams;

import java.util.List;

public class Database {

    private List<Usuario> listaUsuarios = List.of(new Usuario(1, "Joseph", "joseph@gmail.com", "ATIVO")
            , new Usuario(2, "Maria", "maria@gmail.com", "INATIVO")
            , new Usuario(3, "Pedro", "pedro@gmail.com", "ATIVO"));

    public Usuario findById(int idUsuario) {

        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == idUsuario) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
