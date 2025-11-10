public class ArrayNew {
        public static void main(String[] args) {
            int[] firstArray = {56, 78, 1, 102, 14, 42, 8, 65, 78, 100};
            int[] sortedArray = new int[10];

            // Bubble sort - sortér firstArray i stigende rækkefølge
            for (int i = 0; i < firstArray.length - 1; i++) {
                for (int j = 0; j < firstArray.length - 1 - i; j++) {
                    if (firstArray[j] > firstArray[j + 1]) {
                        // byt pladser
                        int temp = firstArray[j];
                        firstArray[j] = firstArray[j + 1];
                        firstArray[j + 1] = temp;
                    }
                }
            }

            // Kopiér det sorterede array til secondArray
            for (int i = 0; i < firstArray.length; i++) {
                sortedArray[i] = firstArray[i];
            }

            // Udskriv resultatet
            System.out.println("Sorterede tal:");
            for (int tal : sortedArray) {
                System.out.print(tal + " ");
            }
        }
    }


