import java.util.Arrays;

public class SelectionSortDriver {
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 8, 1, 7, 4, 3, 2};
        selectionSort(array);
    }
    public static void selectionSort(int[] array) {
        System.out.println("Selection Sorting:");

        for(int i = 0; i < array.length - 1; i++) {
            int minimum = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[minimum] > array[j]) {
                    minimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;

            System.out.println(Arrays.toString(array));
        }
    }
}
