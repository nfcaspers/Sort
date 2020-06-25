import java.util.Random;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] unsortedArray = rand.ints(100, 0, 1000).toArray();
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray)+"\n");
        int[] sortedArray = bubblesort(unsortedArray);
        System.out.println(Arrays.toString(sortedArray));
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