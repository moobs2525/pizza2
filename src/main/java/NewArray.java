public class NewArray {
    public static void main(String[] args) {
        int[] firstArray = {56, 78, 1, 102, 14, 42, 8, 65, 78, 100};
        int[] secondArray = new int[10];
        int size = 0;


        for (int i = 0; i < firstArray.length - 1; i++) {
            for (int j = 0; j < firstArray.length - 1 - i; j++) {
                if (firstArray[j] > firstArray[j + 1]) {
                    int temp = firstArray[j];
                    firstArray[j] = firstArray[j + 1];
                    firstArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        System.out.println("numerisk rækkefølge er ");
        for (int sortedNumber : secondArray) {

            System.out.print(sortedNumber + ", ");
        }

//1, 8, 14, 42, 56, 65, 78, 78, 100, 102


    }
}