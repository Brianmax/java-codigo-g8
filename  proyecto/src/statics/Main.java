package statics;

import interfaces.Lista;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("george", "123");
        Usuario usuario2 = new Usuario("jose", "123");
        Usuario usuario3 = new Usuario("rafa", "123");
        Usuario usuario4 = new Usuario("rafa", "123");


        System.out.println(Usuario.numUsers);

        Usuario.restartNumUsers();


    }
}
