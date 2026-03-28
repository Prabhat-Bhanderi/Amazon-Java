package amazon.homework.week2;

public class Pet {
    String name;
    boolean isHungry;
    int happyNessLevel;

    void playWithPet(){
        happyNessLevel++;
    }
    void feedPet(){
        isHungry = false;
    }

    void statusCheck(){
        if (isHungry || (happyNessLevel < 5)) {
            System.out.println(name + " is not happy");
        } else {
            System.out.println(name + " is happy");
        }

    }

    static void main() {
      Pet fatCat  = new Pet();
      fatCat.happyNessLevel = 4;
      fatCat.isHungry = true;
      fatCat.name = "Tom";
      fatCat.statusCheck();
      fatCat.feedPet();
      fatCat.playWithPet();
      fatCat.statusCheck();
    }

}
