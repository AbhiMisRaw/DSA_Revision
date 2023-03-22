package ArrayConcept;
import java.util.Arrays;
public class SortingMain {
    public static void main(String[] args) {
        Sorting sr = new Sorting();

        int[] ar = {34,12,56,23,45,21,32,12,1};
        sr.bubbleSort(ar);
        System.out.println("selection Sort " + Arrays.toString(ar));

        int[] arr = {34,12,56,23,45,21,32,12,1};
        sr.selectionSort(arr);
        System.out.println("selection Sort " + Arrays.toString(arr));

        int[] arr1 = {34,12,32,16,78,43,30,20,57,19};
        sr.insertionSort(arr1);
        System.out.println("insertion Sort " + Arrays.toString(arr1));
    }
}