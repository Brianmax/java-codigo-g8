package statics;

public class Usuario {
    private String username;
    private String password;
    static int numUsers = 0;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        numUsers++;
    }

    //
    static void restartNumUsers() {
        numUsers = 0;
    }
}
