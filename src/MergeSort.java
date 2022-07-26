import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        String[] array = { "Hindi", "English", "Tamil", "Telugu", "Malayalam", "Kannada" };
        mergeSort(array, 0, array.length - 1);
        System.out.println("Result " + Arrays.toString(array));
    }

    public static void mergeSort(String[] array, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;


         //sort the first and the second half

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }
    // end mergeSort

    public static void merge(String[] array, int low, int mid, int high) {

        //  size of the range to be merged

        int n = high - low + 1;


        // merge both halves into a temporary array b

        String[] b = new String[n];

         // element to consider in starting range

        int i1 = low;
        //element in second range
        int i2 = mid + 1;
        int j = 0; // next open position in b


        while (i1 <= mid && i2 <= high) {
            if (array[i1].compareTo(array[i2]) < 0) {
                b[j] = array[i1];
                i1++;
            } else {
                b[j] = array[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = array[i1];
            i1++;
            j++;
        }
        //remaining entries in second half

        while (i2 <= high) {
            b[j] = array[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            array[low + j] = b[j];
        }
    }
}
