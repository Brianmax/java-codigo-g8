package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        LibraryUser user1 = new LibraryUser("george1", 1);
        LibraryUser user2 = new LibraryUser("george2", 2);
        LibraryUser user3 = new LibraryUser("george3", 3);
        LibraryUser user4 = new LibraryUser("george4", 4);
        LibraryUser user5 = new LibraryUser("george5", 5);

        Dvd dvd1 = new Dvd("movie1", 1, false, "director1", 120);
        Dvd dvd2 = new Dvd("movie2", 2, false, "director2", 120);
        Dvd dvd3 = new Dvd("movie3", 3, false, "director3", 120);

        Book book1 = new Book("book1", 4, false, "author1");
        Book book2 = new Book("book2", 5, false, "author2");
        Book book3 = new Book("book3", 6, false, "author3");


        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(dvd3);
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);
        library.addUser(user4);
        library.addUser(user5);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Que operacion desea realizar");
            System.out.println("1. Prestamo");
            System.out.println("2. Retorno");
            System.out.println("3. Mostrar items");
            System.out.println("0. Salir");

            int option = sc.nextInt();

            if(option==1) {
                System.out.println("Ingrese el id del usuario");
                int userId = sc.nextInt();
                System.out.println("Ingrese el id del item");
                int itemId = sc.nextInt();
                library.loanItem(itemId, userId);
            } else if (option == 2) {
                System.out.println("Ingrese el id del usuario");
                int userId = sc.nextInt();
                System.out.println("Ingrese el id del item");
                int itemId = sc.nextInt();
                library.returnItem(itemId, userId);
            } else if (option == 3) {
                library.showAllItems();
            } else {
                break;
            }
        }

    }
}
