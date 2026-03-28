package amazon.learn.week2;

public class ShoppingItem {

   private String name;
   private int quantity;

    public ShoppingItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0 && quantity <= 10) {
            this.quantity = quantity;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.length() > 2) {
            this.name = name;
        }
    }
}
