import java.util.Scanner;
public class CalculatePercentage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();
        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (double) totalMarks / 3; // Assuming each subject has equal weight
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
