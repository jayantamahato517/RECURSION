class jay{
    public static int binarysearch(int arr[], int key, int low, int high){
        //base case
        if(low > high){
            return -1;
        }
        //find middle
        int mid = low + (high - low)/2;

        //key found
        if(arr[mid] == key){
        return mid;
    }
    if(key < arr[mid]){
        return binarysearch(arr, key, low, mid-1);
    } else {
        return binarysearch(arr, key, mid+1, high);
    }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        int key = 6;
        int result = binarysearch(arr, key, 0, arr.length-1);

        if(result != -1){
            System.out.println("Element is found at index : " + result);
        } else {
            System.out.println("Element is not found");
        }
    }
}