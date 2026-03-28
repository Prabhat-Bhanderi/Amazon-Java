package amazon.homework.week1;

public class NumberAnalyzer {
    public static void main(String[] args) {

        int[] numbers = {3, 14, 7, 22, 45, 8, 31, 16, 5, 42};

        System.out.println("Numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // --- Even numbers ---
        System.out.println("Even numbers:");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // --- Numbers greater than 15 ---
        System.out.println("Numbers greater than 15:");
        for (int n : numbers) {
            if (n > 15) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // --- Numbers in range 10 to 30 ---
        System.out.println("Numbers in range 10 to 30:");
        for (int n : numbers) {
            if (n >= 10 && n <= 30) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
