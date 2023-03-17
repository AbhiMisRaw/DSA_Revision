package ArrayConcept;

public class ArraySearchMain {
    public static void main(String[] args) {
        ArraySearch as = new ArraySearch();
        int arr[] = {2,4,23,421,12,32,1,34};

        int srt[] ={23,45,57,67,79,88};
        System.out.println(as.linearSearch(arr, 1));
        System.out.println(as.binarySearch(srt,9));
    }
}
