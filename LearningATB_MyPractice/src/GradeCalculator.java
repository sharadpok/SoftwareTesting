import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student score");
        int score = sc.nextInt();
        char grade = 0;
        if(score>=90 && score<=100)
        {
            grade = 'A';
        } else if (score>=80 && score<=89) {
            grade = 'B';
        } else if (score>=70 && score<=79) {
            grade = 'C';
        } else if (score>=60 && score<= 69) {
            grade = 'D';
        }else if (score>=0 && score<=59)
        {
         grade = 'F';
        }else {

            System.out.println("Invalid Input, Please enter positive number between 0 to 100");
            System.out.println("Grade is Lol");
        }

        System.out.println("Your Grade is "+ grade);
    }
}
