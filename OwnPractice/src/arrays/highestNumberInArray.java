package arrays;

public class highestNumberInArray {
    public static void main(String[] args) {

        int[] array_Marks = {90, 92, 94,80, 98, 70};
        // initialising Max to value
        int max=0;
        for (int i=0; i<array_Marks.length; i++)
        {
            if(array_Marks[i]>max)
            {
                max = array_Marks[i];

            }
        }
        System.out.println("Maximum number in the array is: "+ max);
    }
}
