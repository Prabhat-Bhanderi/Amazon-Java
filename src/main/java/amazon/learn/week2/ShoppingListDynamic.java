package amazon.learn.week2;

import java.util.ArrayList;

public class ShoppingListDynamic {

    private ArrayList<ShoppingItem> items;

    public ShoppingListDynamic(ArrayList<ShoppingItem> items) {
        this.items = items;
    }

    static void main() {
        ShoppingListDynamic shoppingListDynamic = new ShoppingListDynamic(new ArrayList<ShoppingItem>());


        /*
        // Normal way/ Long way

        ShoppingItem milk = new ShoppingItem();
        milk.name = "Milk";
        milk.quantity = 10;
        shoppingListDynamic.items.add(milk);

        ShoppingItem chocolate = new ShoppingItem();
        chocolate.name = "Chocolate";
        chocolate.quantity = 2;
        shoppingListDynamic.items.add(chocolate);

        ShoppingItem cake = new ShoppingItem();
        cake.name = "Cake";
        cake.quantity = 6;
        shoppingListDynamic.items.add(cake);

        ShoppingItem flour = new ShoppingItem();
        flour.name = "Flour";
        flour.quantity = 8;
        shoppingListDynamic.items.add(flour);

         */

        /*

        // getter and setter methpd
        ShoppingItem milk = new ShoppingItem();
        milk.setName("milk");
        milk.setQuantity(10);
        shoppingListDynamic.items.add(milk);

        ShoppingItem cake = new ShoppingItem();
        cake.setName("cake");
        cake.setQuantity(5);
        shoppingListDynamic.items.add(cake);

        ShoppingItem chocolate = new ShoppingItem();
        chocolate.setName("chocolate");
        chocolate.setQuantity(10);
        shoppingListDynamic.items.add(chocolate);

         */

        ShoppingItem milk = new ShoppingItem("Milk", 1);
        shoppingListDynamic.items.add(milk);

        ShoppingItem cake = new ShoppingItem("Cake", 5);
        shoppingListDynamic.items.add(cake);

        ShoppingItem chocolate = new ShoppingItem("Chocolate", 10);
        shoppingListDynamic.items.add(chocolate);

        for(int i = 0; i < shoppingListDynamic.items.size(); i++) {
            ShoppingItem shoppingItem = shoppingListDynamic.items.get(i);
            System.out.println(shoppingItem.getName() + " - " + shoppingItem.getQuantity());
        }

        shoppingListDynamic.items.removeLast();
        System.out.println("After removing last item:");
        for (ShoppingItem item : shoppingListDynamic.items) {
            System.out.println(item.getName() + " - " + item.getQuantity());
        }
    }
}
