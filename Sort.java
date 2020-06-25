import java.util.Random;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] unsortedArray = rand.ints(25, 0, 1000).toArray();
        printStatus("Bubblesort", bubblesort(unsortedArray));
    }
    public static void printStatus(String sortingAlgorithm, int[] arr) {
        if(checkArraySorted(arr)) {
            System.out.println(sortingAlgorithm + " was successful");
        } else {
            System.out.println(sortingAlgorithm + " was not successful");
        }
    }
    public static boolean checkArraySorted(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static int[] bubblesort(int[] arr) {
        for(int x=0; x < arr.length; x++) {
            for(int y=0; y < arr.length - 1; y++) {
                if(arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
        return arr;
    }
}