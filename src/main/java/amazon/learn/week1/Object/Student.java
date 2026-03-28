package amazon.learn.week1.Object;

public class Student {
    String name;
    double grade;

    static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.grade = 87;

        Student student2 = new Student();
        student2.name = "Alice";
        student2.grade = 92;

        Student student3 = new Student();
        student3.name = "Bob";
        student3.grade = 93;

        if(student1.grade > student2.grade && student1.grade > student3.grade) {
            System.out.println(student1.name + " has the highest grade: " + student1.grade);
        }
        if (student2.grade > student1.grade && student2.grade > student3.grade) {
            System.out.println(student2.name + " has the highest grade: " + student2.grade);
        }
        if (student3.grade > student1.grade && student3.grade > student2.grade) {
            System.out.println(student3.name + " has the highest grade: " + student3.grade);
        }

       double averageGrade = (student1.grade + student2.grade + student3.grade)/3;
        System.out.println("Average grade of the class is: " + averageGrade);

    }
}
