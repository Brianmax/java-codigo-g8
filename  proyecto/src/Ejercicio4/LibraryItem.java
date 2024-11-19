package Ejercicio4;

public class LibraryItem {
    protected String title;
    protected int itemId;
    boolean isLoaned;

    public LibraryItem(String title, int itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public void printInfo() {
        System.out.println("Title: "+ title);
        System.out.println("Item id: " + itemId);
        System.out.println("Loaned: " + isLoaned);
    }
}
