package ArrayConcept;

public class Sorting {
    public void bubbleSort(int[] arr){
        int i , pass ;
        for(pass = 0 ; pass < arr.length-1 ; pass++){
            for(i = 1 ; i < arr.length ; i++){
                if(arr[i] < arr[i-1]){
                    swap(arr , i , i-1);
                }
            }
        }
    }
    private void swap(int[] arr, int x , int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp ;
    }

    public void selectionSort(int[] arr ){
        for(int j = 0 ; j < arr.length ; j++){
            int minIndex = findMinIndex(arr , j);
            swap(arr , minIndex , j);
        }
    }
    public int findMinIndex(int[] arr, int s){
        int min = Integer.MAX_VALUE ;
        int minIndex = s ;
        for( int i = s ; i < arr.length ;i++ ){
            if(arr[i]  < min){
                min = arr[i];
                minIndex = i ;
            }
        }
        return minIndex ;
    }


    public void insertionSort(int[] arr){
        for(int i = 1 ; i < arr.length ; i++){
            int j = i ;
            while(j>=1 && arr[j] < arr[j-1] ){
                swap(arr, j,j-1);
                j--;
            }
        }
    }

}
