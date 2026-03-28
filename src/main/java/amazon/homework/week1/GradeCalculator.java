package amazon.homework.week1;

public class GradeCalculator {
    double grade;

    static void main(String[] args) {
       double grade = 69.99;

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade! Please enter a Grade between 0 and 100.");

        } else if (grade >= 90) {
            System.out.println("Grade   : A");
            System.out.println("Message : Excellent! Outstanding performance!");

        } else if (grade >= 80) {
            System.out.println("Grade   : B");
            System.out.println("Message : Great job! Keep pushing for that A!");

        } else if (grade >= 70) {
            System.out.println("Grade   : C");
            System.out.println("Message : Good effort! A little more work and you'll get there!");

        } else if (grade >= 60) {
            System.out.println("Grade   : D");
            System.out.println("Message : You passed! But there is room to improve. Don't give up!");

        } else {
            System.out.println("Grade   : F");
            System.out.println("Message : Don't be discouraged. Study harder and you'll do better next time!");
        }

    }
}
