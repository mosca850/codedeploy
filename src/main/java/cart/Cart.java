package cart;

import java.util.ArrayList;

public class Cart {

    private final long id;
    private String customer;
    private ArrayList<Item> content;

    public Cart(long id,String customer) {
        this.id = id;
        this.customer=customer;
        this.content = new ArrayList<Item>();
    }

    public long getId() {
        return id;
    }

    public ArrayList<Item> getItems() {
        return content;
    }
}