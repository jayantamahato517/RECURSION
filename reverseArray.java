import java.util.Arrays;

public class reverseArray {
    public static void reverseArray(int arr[], int start, int end){

        //base case
        if(start >= end){
            return;
        }

        //swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //recursive call
        reverseArray(arr, start+1, end-1);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
