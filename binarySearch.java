public class binarySearch {
    public static int binarySearch(int arr[], int key, int low, int high){

        //base case
        if(low > high){
            return -1;
        }
        //find middle index

        int mid = low + (high - low)/2;

        //key found
        if(arr[mid] == key){
        return mid;
    }

    //search in left half
    if(key < arr[mid]){
        return binarySearch(arr, key, low, mid-1);
    }

    //search in right half
    return binarySearch(arr, key, mid+1, high);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 3;

        int result = binarySearch(arr, key, 0, arr.length-1);

        if(result != -1){
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
