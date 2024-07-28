package operators;

public class Practice008 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c); //33

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // AB ->char
        System.out.println(c1); //(65+66) //131
        System.out.println('A' == 65);  // true
        System.out.println('B' == 69);  // false
    }
}
