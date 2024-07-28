package extra;

import java.util.Scanner;

public class lab001 {
    public static void main(String[] args) {

        int[] marks = new int[6];

        Scanner sc=new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        for(int i=0; i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
