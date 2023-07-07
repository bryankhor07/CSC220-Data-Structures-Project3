import java.util.Arrays;

public class ShellSortDriver {
    public static void main(String[] args) {
        int[] array = {9, 6, 8, 7, 5, 1, 3, 2, 4, 5};
        shellSort(array);
    }

    public static void shellSort(int[] array) {
        System.out.println("Shell Sorting: ");

        for(int space = array.length / 2; space > 0; space /= 2) {
            for(int i = space; i < array.length; i++) {
                int temp = array[i];
                int j = i;
                while (j >= space && array[j - space] > temp) {
                    array[j] = array[j - space];
                    j -= space;
                }
                array[j] = temp;
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
