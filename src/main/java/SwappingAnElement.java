import java.util.Arrays;

public class SwappingAnElement {
    public static void main (String[] args){
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        int[] temp = new int[11];

        for (int i = 0; i < numbers.length/2; i++) {
           temp[i] = numbers[i];
           numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
