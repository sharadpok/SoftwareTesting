package stringClass;

public class Practice001 {

    public static void main(String[] args) {
        String name = "Pramod";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)

        //--------------------------------------------------------------

        String s1 = "Pramod";
        // 1 , SCP
        s1 = "Amit";
        // 2 , SCP
        s1 = "Dutta";
        // 3 . SCP
        s1 = "Pramod";
        // 3, SCP

        //-----------------------------------------------------------

        String ss1 = new String("Pramod");
        String ss2 = new String("Pramod");
        //  2, Heap area
        String ss3  = ss1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Pramod

        //------------------------------------------------------

        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        String str4= str1.concat(str2); // Hello Guys
        // SCAP -  4


    }

}
