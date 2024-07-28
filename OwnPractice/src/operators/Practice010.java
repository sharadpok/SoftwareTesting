package operators;

public class Practice010 {
    public static void main(String[] args) {
        // Increment (++) / Decrement (--) Operators
        // Pre and Post

        // pre - increment ++operand
        // value is incremented first and then stored in the result.

        int a = 10;
        int b = ++a; // a = a+1;
        // Exp = 11 , a = 11
        System.out.println(a);
        System.out.println(b);



        // POST
        //  value is stored in the result and incremented later
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        // Exp = 10 , a = 11



    }


}
