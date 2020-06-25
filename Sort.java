import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] unsortedArray = rand.ints(25, 0, 1000).toArray();
        printStatus("Bubblesort", bubblesort(unsortedArray.clone()));
        printStatus("Selectionsort", selectionsort(unsortedArray.clone()));
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
            for(int y=0; y < arr.length-1; y++) {
                if(arr[y] > arr[y+1]) {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] selectionsort(int[] arr) {
        for(int sortedIndex=0; sortedIndex < arr.length-1; sortedIndex++) {
            //Index of smallest number in unsorted part of array
            int minIndex = sortedIndex; 
            //Find smallest int in unsorted part of array
            for(int x=sortedIndex+1; x < arr.length; x++) { 
                if(arr[minIndex] > arr[x]) {
                    minIndex = x;
                }
            }
            //insert smallest int behind last int in sorted part
            //Sorted part growths by one each iteration
            int temp = arr[sortedIndex];
            arr[sortedIndex] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}