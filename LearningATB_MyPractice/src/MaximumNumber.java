import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        Scanner sc1= new Scanner(System.in);
        System.out.println("Please enter Second number");
        int num2 = sc.nextInt();

        if(num1 > num2)
        {
            System.out.println("Greater number is"+ num1);
        } else if (num2>num1) {
            System.out.println("Greater numer is "+num2);

        }else
        {
            System.out.println("Both numbers are equal");
        }

    }

}
