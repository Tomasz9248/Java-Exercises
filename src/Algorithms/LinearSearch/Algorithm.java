package Algorithms.LinearSearch;

/* Linear search is iterating over array checking every index
in ordered array when a[i] > searchKey search stops
 */

public class Algorithm {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 20, 21, 22, 23, 24, 25};
        int[] array2 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] array3 = {31, 32, 33, 34, 35, 36, 37, 38, 39};

        System.out.println("#### First search should stop when reach 7 < 20 ####");
        Algorithm.find(7, array); //
        System.out.println("#### Second search should print index when number matches ####");
        Algorithm.find(14, array2);
        System.out.println("#### Third search should itarate over every index  ####");
        Algorithm.find(50, array3);
    }

    private static void find(long searchKey, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] == searchKey) {
                System.out.println("The index number is " + i);
                break;
            } else if (array[i] > searchKey) {
                System.out.println("Search key is not in the array");
                break;
            }
        }
        if (array[array.length - 1] < searchKey) {
            System.out.println("Search key is not in the array");
        }
    }
}