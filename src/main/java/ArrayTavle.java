import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTavle {
    public static void main(String[] args) {
        int[] unsortedNos = {5, 200, 7, 1, 800, 10, 9, 9};
        int[] sortedNos = new int[unsortedNos.length];
        final int DEF_TAKEN = -1;
        //Arrays.sort(unsortedNos);
       // System.out.println(Arrays.toString(unsortedNos));

    for (int i = 0; i < unsortedNos.length; i++) {
            int min = unsortedNos[i];
            //int min = Integer.MAX_VALUE;  // så behøver man ikke else if delen

            int minIndex = i;

            for (int j = 0; j < unsortedNos.length; j++){
                if (min > unsortedNos[j] && DEF_TAKEN != unsortedNos[j]){
                    min = unsortedNos[j];
                    minIndex = j;
                }
                else if(min == DEF_TAKEN){
                    min = unsortedNos[j];
                    minIndex = j;

                }
            }
            sortedNos[i] = min;
            unsortedNos[minIndex] = DEF_TAKEN;


        }
        System.out.println("sorted array " + Arrays.toString(sortedNos));
    }
}