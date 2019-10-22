public class Item {

    private String ID_name;
    private double quantity;
    private double price;
    private static int counter=0;
    private int ID_counter;


    public Item(String ID_name, double quantity, double price) {
        this.ID_name = ID_name;
        this.quantity = quantity;
        this.price = price;
        counter+=1;
        this.ID_counter = counter;

    }

    public String getID_name() {
        return ID_name;
    }

    public void setID_name(String ID_name) {
        this.ID_name = ID_name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Item.counter = counter;
    }

    public int getID_counter() {
        return ID_counter;
    }

    public void setID_counter(int ID_counter) {
        this.ID_counter = ID_counter;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID_name='" + ID_name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", ID_counter=" + ID_counter +
                '}';
    }
}
