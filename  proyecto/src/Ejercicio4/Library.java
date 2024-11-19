package Ejercicio4;

import herencia.Profesor;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> libraryUsers;

    Library() {
        libraryItems = new ArrayList<>();
        libraryUsers = new ArrayList<>();
    }
    // metodos

    public void addItem(LibraryItem libraryItem) {
        libraryItems.add(libraryItem);
    }
    public void addUser(LibraryUser libraryUser) {
        libraryUsers.add(libraryUser);
    }

    public void showAllItems(){
        for(LibraryItem item: libraryItems) {
            System.out.println("=======================");
            item.printInfo();
            System.out.println("=======================");
        }
    }

    public void loanItem(int itemId, int userId) {
        // verificar el item
        // verificar el usuario
        // operacion de prestamo

        LibraryUser user = verifyUser(userId);
        LibraryItem item = verifyItem(itemId, true);

        if(user == null || item == null) {
            System.out.println("The user or the item is invalid");
            return;
        }

        // prestamo

        user.getLoanedItems().add(item);
        item.setLoaned(true);
        System.out.println("The loan was successfully completed");
    }

    public void returnItem(int itemId, int userId) {

        LibraryUser user = verifyUser(userId);
        LibraryItem item = verifyItem(itemId, false);

        if (user == null || item == null) {
            System.out.println("The user or the item is invalid");
            return;
        }

        user.getLoanedItems().remove(item);
        item.setLoaned(false);
        System.out.println("The item was successfully returned");
    }

    private LibraryUser verifyUser(int userId) {
        for(LibraryUser user: libraryUsers) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    private LibraryItem verifyItem(int itemId, boolean loan) {
        for (LibraryItem item: libraryItems) {
            if(item.getItemId()==itemId && !item.isLoaned() && loan) {
                return item;
            } else if( item.getItemId() == itemId && item.isLoaned() && !loan) {
                return item;
            }
        }
        return null;
    }

}
