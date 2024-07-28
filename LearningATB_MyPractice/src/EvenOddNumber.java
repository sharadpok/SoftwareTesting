import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please inter number");

        int user_int = sc.nextInt();
        System.out.println("Entered Number is "+user_int);
        if(user_int%2==0)
        {
            System.out.println("And it's Even");
        }else
        {
            System.out.println("And it's Odd");
        }

}

}
