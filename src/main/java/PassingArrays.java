import java.util.Arrays;

public class PassingArrays {
    public static void main(String[] args){
        int[] numbers =new int[10];
        int magicNo = 99;
        addNumbers(numbers,magicNo);
        System.out.println(Arrays.toString(numbers));
        System.out.println("what is magicNo: " + magicNo);
    }
    private static void addNumbers(int[] numbers, int magicNo){

      //  System.out.println("what is magicNo: " + magicNo);//99
       // magicNo = 101;
       // numbers = new int[10];
       // System.out.println("what is magicNo: " + magicNo);//101

        if(numbers.length > 5)
        {
            numbers[5] =42;
        }
    }



}
