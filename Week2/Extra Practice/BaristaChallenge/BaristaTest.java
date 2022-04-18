public class BaristaTest{
    public static void main(String[] args) {
    System.out.println("Trevor smells");
    
    Item item1 = new Item("Mocha", 4.5);
    Item item2 = new Item("Latte", 3);
    Item item3 = new Item("Drip Coffee", 2.75);
    Item item4 = new Item("Capuccino", 5.20);

    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order("Jimmy");
    Order order4 = new Order("Sam");
    Order order5 = new Order("Noah");

    order3.addItem(item3);
    order3.addItem(item1);

    order1.addItem(item2);
    order1.addItem(item4);

    order3.display();
    order3.setReady(true);
    System.out.println(order3.getStatus());
    System.out.println(order3.getTotal());
    
    order1.display();
    order1.setReady(false);
    System.out.println(order1.getStatus());

    order2.display();

    order4.display();

    order5.display();
}
}