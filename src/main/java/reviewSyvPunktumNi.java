public class reviewSyvPunktumNi {
    public static void main(String[] args) {
        int[] num = {5, -2, 7, 9, -6, 8};
        int max = num[0];
        int numNeg = 0;

        for (int i : num) {
            System.out.print(" " + i);// Printing all elements of an array in a single row, separated by spaces.

            // temp[i] = numbers[i];
            //numbers[i] = numbers[numbers.length-1-i];
            // numbers[numbers.length-1-i] = temp[i];
        }
//Computing the maximum of all elements in an array.
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];

                System.out.println(max);
            }

        }
        //Counting how many elements in an array are negative.
        for (int i = 1; i < num.length; i++) {
            if (num[i]<0){
                numNeg++;

            }

        }
        System.out.println(numNeg);
    }
}
