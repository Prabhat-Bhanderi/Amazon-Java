package amazon.learn.week2;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean personWantToEnd = false;
        while (!personWantToEnd) {
            System.out.println("Do you want to end the conversation? (yes/no)");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                personWantToEnd = true;
            }
        }
        System.out.println("Good bye!");
    }
}
