/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * Author: Duc Ta
 * Author: Bryan Khor
 * **********************************************
 */

public class ArraySortByFirst {
    public static void sortByFirst(int data[][]) {
        int counter = 2;
        for (int row = 1; row < data.length; row++) {
            if (data[row][0] == counter) {
                for (int col = 0; col < data[row].length; col++) {
                    int temp2 = data[counter - 1][col];
                    data[counter - 1][col] = data[row][col];
                    data[row][col] = temp2;
                }
                counter++;
                row = 1;
            }
        }
    }

    public static void display(int data[][]) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col]);
            }
            System.out.println();
        }
    }

    //
    // Please do not change any code in the main method
    //
    public static void main(String args[]) {
        int array[][] = {{1, 2, 3, 4, 5},
                {3, 4, 5, 1, 2},
                {5, 2, 3, 4, 1},
                {2, 3, 1, 4, 5},
                {4, 2, 3, 1, 5}};

        System.out.println("The array is initially ");
        display(array);
        System.out.println();

        sortByFirst(array);
        System.out.println("The array after sorting is ");
        display(array);
        System.out.println();
    }
}
