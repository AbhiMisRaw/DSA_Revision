package ArrayConcept;

public class ArraySearch {
    public int linearSearch(int[] arr, int num){
        int count = 0 ;
        for (int x : arr){
            if(x == num){
                return count ;
            }else count++;
        }
        return -1;
    }
    public int binarySearch(int[] arr, int num){
        int s = 0;
        int e = arr.length ;
        int m = 0;
        while(s <= e){
            m = (s+e)/2;
            if(arr[m] == num){
                return m ;
            } else if (arr[m] < num) {
                s = m ;
            }else e = m-1 ;
        }
        return -1;
    }

}
