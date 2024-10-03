package week15;

public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }
    public void printItem() {
        System.out.println("Item: " + item);
    }
}