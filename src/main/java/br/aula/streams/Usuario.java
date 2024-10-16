package br.aula.streams;

import java.util.Objects;
import java.util.Random;

public class Usuario {

    private int id;
    private String nome;
    private String email;

    private String status;

    public Usuario(int id, String nome, String email, String status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.status = status;
    }

    public Usuario(String nome){
        Random random = new Random();
        this.id =random.nextInt();
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {return email;}

    public String getNome() {return nome;}

    public String getStatus() {return status;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email) && Objects.equals(status, usuario.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, status);
    }
}
