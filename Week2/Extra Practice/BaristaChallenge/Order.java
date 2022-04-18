import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatus() {
        if (this.ready == true) {
            return "Your order is ready!";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon!";
        }
    }

    public double getTotal() {
        double total = 0;
        for(Item order: this.items) {
            total += order.getPrice();
        }
        return total;
    }
    
    public void display() {
        System.out.println("Customer name: " + this.name);
        for(Item order: this.items) {
            System.out.println(order.getName() + " - $" + order.getPrice());
        }
        System.out.println("Total: $" + this.getTotal());
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}

