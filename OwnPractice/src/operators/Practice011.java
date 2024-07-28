package operators;

public class Practice011 {

    public static void main(String[] args) {

        System.out.println("First Part");
        int a = 10;
        int result = a++;
        // exp 10, a= 11
        System.out.println(a);  // 11
        System.out.println(result);  //10
//
//        // Exp = 10 , a = 11?

        System.out.println("Second Part");
        int b = 10;
        int result1 = ++b;
        System.out.println(b);
        System.out.println(result1);

        // Exp = 11 , a = 11?
        System.out.println("Third Part");
        int a2 = 10;
        System.out.println(a2++ + ++a2);
        System.out.println(a2);
        // A - a++  -> Exp = 10 | a = 11
        // + - operator
        // B- a++  -> Exp = 12 | a = 12

        System.out.println("Fourth Part");
        int a3 = 10;
        System.out.println(++a3 + ++a3);
        System.out.println(a3);
        // A -> ++a , Exp = 11    |  a = 11
        // + -> nothing
        // B -> ++a  Exp =  12 | a = 12
        // Exp = A+B = 23 , a = 12

        System.out.println("Fifth Part");
        int a4 = 10;
        System.out.println(++a4 + a4++ + a4++);
        System.out.println(a4);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13
        // op ->  exp1+ exp2+exp3
        // a  = 13



    }
}
