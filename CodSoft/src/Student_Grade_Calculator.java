import java.util.Scanner;
public class Student_Grade_Calculator {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);      
        System.out.print("Enter the number of subjects: ");
        int totalnumSubjects = s.nextInt();
        int[] marks = new int[totalnumSubjects];
        for (int i = 0; i < totalnumSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = s.nextInt();
        }
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averagePercentage = (double) totalMarks / totalnumSubjects;
        char grade;
        if (averagePercentage >= 92) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        s.close();
    }
}

