package amazon.learn.week1.Object;

public class Food {

    int numberOfItems;
    String name;
    String description;
    double cost;

    public static void main(String[] args) {

        Food milk = new Food();
        milk.name = "Milk";
        milk.description = "Milk of making coffe or tee";
        milk.numberOfItems = 5;
        milk.cost = 2.99;

        Food banana = new Food();
        banana.name = "Banana";
        banana.description = "Banana Milk shake";
        banana.numberOfItems = 12;
        banana.cost = 1.99;

//        System.out.println( "From " +banana.name + " we can make " + banana.description);
//        System.out.println( "Total number of milk " + milk.numberOfItems);
//        System.out.println( banana.name.equals(milk.name) );
//
//        System.out.println( "Length of banana Word " +banana.name.length());
//        System.out.println("3rd Letter of Banana Word " + banana.name.charAt(2));
//        System.out.println("Trimmed text " + "    Tax with wight space    ".strip());
//
//        System.out.println(banana.name.split("a"));

        System.out.println("Cost of 1 Kg Banana and 3 Milk is " +(banana.cost +  (milk.cost)*3) );

        // One box contains 5 Milk and you want to buy an 13 Milk how many milk should be in last box
        System.out.println("Number of Milk in last box " + (13%5));

        if(milk.cost  < banana.cost){
            System.out.println("Milk is cheeper");
        } else if(milk.cost > banana.cost){
            System.out.println("Banana is cheeper");
        } else {
            System.out.println("Both are at same price");
        }
    }
}
