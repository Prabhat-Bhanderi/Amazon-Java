package amazon.learn.week1.loops;

import java.util.Arrays;

public class ClassOfStudents {
    String[] studentNames;
    double[] studentGrades;

    static void main(String[] args) {
        int numOfStudents = 5;

        ClassOfStudents class11 = new ClassOfStudents();

        /*

            // index initialization
            class11.studentNames = new String[numOfStudents];
            class11.studentNames[0] = "Alex";
            class11.studentNames[1] = "Bob";
            class11.studentNames[2] = "Jack";
            class11.studentNames[3] = "James";
            class11.studentNames[4] = "John";

            class11.studentGrades = new double[numOfStudents];
            class11.studentGrades[0] = 1.5;
            class11.studentGrades[1] = 1;
            class11.studentGrades[2] = 3.8;
            class11.studentGrades[3] = 2.7;
            class11.studentGrades[4] = 3.3;

        */

        class11.studentNames = new String[]{"Alex1", "Bob", "Jack", "Rock", "John"};
        class11.studentGrades = new double[]{1.5, 1, 1,2.7,3.3};

        // Sum of all grades
        double sum = 0;
        for (int i = 0; i < class11.studentGrades.length; i++) {
            sum += class11.studentGrades[i];
        }
        System.out.println("Sum of all grades: " + sum);
        System.out.println("Sum of all grades: " + Arrays.stream(class11.studentGrades).sum());

        // give the average grades
        double average = sum / class11.studentGrades.length;
        System.out.println("Average grade: " + average);
        System.out.println("Average grade: " + Arrays.stream(class11.studentGrades).average());

        // give me the student name who has the highest grade
        int indexOfBestStudent = 0;
        for (int i = 1; i < class11.studentGrades.length; i++) {
            if(class11.studentGrades[i] < class11.studentGrades[indexOfBestStudent]) {
                indexOfBestStudent = i;
            }
        }

        System.out.println("Student with the highest grade is " + class11.studentNames[indexOfBestStudent] + " with grade: " + class11.studentGrades[indexOfBestStudent]);

        int numOfCharInStudentName = 0;
        // print the first letter of all names
        for(String studentName : class11.studentNames) {
            numOfCharInStudentName = numOfCharInStudentName + studentName.length();
            System.out.println("1st Letter of Students names " + studentName.charAt(0));
        }

        // give the total number of char in all students name
        System.out.println("Total number of char in all students name " + numOfCharInStudentName);

        // count the number of student with the grade below 2
        int countOfStudentsWithGradeBelow2 = 0;
        for(double studentGrade : class11.studentGrades) {
            if (studentGrade < 2) {
                countOfStudentsWithGradeBelow2++;
            }
        }
        System.out.println("Number of students with grade below 2: " + countOfStudentsWithGradeBelow2);

        String superStudent = "";
        //print the name of the superstars(Grade with 1)
       for(int i = 0; i < class11.studentGrades.length; i++) {
           if(class11.studentGrades[i] == 1) {
               superStudent = superStudent + " " + class11.studentNames[i] ;
           }
       }
        System.out.println("Super students with grade 1: " + superStudent.trim());

       // find out duplicate student name
        String duplicateStudentName = "";
        for(int i = 0; i < class11.studentNames.length; i++) {
            for(int j = i + 1; j < class11.studentNames.length; j++) {
                if (class11.studentNames[i].equals(class11.studentNames[j])) {
                    duplicateStudentName = class11.studentNames[i];

                }
            }
        }
        System.out.println("Duplicate student name: " + duplicateStudentName);

        // give me the first that has 1.0 grade
        int index = 0;
        while(class11.studentGrades[index] != 1) {
            index++;
        }
        System.out.println("First student with grade 1 is " + class11.studentNames[index] + " with grade: " + class11.studentGrades[index]);

        // Does this class have a student named Alice: Yes , No
        index = 0;
        while (index < class11.studentNames.length && !class11.studentNames[index].equals("Alex")){
            index++;
        }
        System.out.println("Does this class have a student named Alice: " + (index < class11.studentNames.length ? "Yes" : "No"));

        // give me a student who is better than Jack
        // a) Find Jack's grade
        // b) find a batter student
    }
}
