package br.aula.streams;

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

    public int getId() {
        return id;
    }

    public String getEmail() {return email;}

    public String getNome() {return nome;}

    public String getStatus() {return status;}
}
