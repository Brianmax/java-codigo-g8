package Ejercicio4;

import java.util.ArrayList;

public class LibraryUser {
    private String username;
    private int userId;
    private ArrayList<LibraryItem> loanedItems;

    LibraryUser(String username, int userId) {
        this.username = username;
        this.userId = userId;
        this.loanedItems = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setLoanedItems(ArrayList<LibraryItem> loanedItems) {
        this.loanedItems = loanedItems;
    }
}
