import java.util.Arrays;

public class InsertionSortDriver {
    public static void main(String[] args) {
        int[] array = {9, 2, 8, 4, 7, 5, 6, 2, 4, 3, 1, 7};
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        System.out.println("Insertion Sorting:");

        for(int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;

            System.out.println(Arrays.toString(array));
        }
    }
}
