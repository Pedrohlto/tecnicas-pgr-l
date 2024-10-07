package br.aula.streams;

public class Exemplo {

    public static void main(String[] args) {
        Database db = new Database();
        var usuario = db.findById(1);
        System.out.println(usuario.getNome());
    }
}
