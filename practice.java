class jay{
    public static int binarySe(int arr[], int key, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;

        if(key == arr[mid]){
            return mid;
        }
        if(key < arr[mid]){
            return binarySe(arr, key, start, mid-1);
        }
        return binarySe(arr, key, mid+1, end);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 5;
        int result = binarySe(arr, key, 0, arr.length);
        if(result != -1){
            System.out.println("Element is found at index : " + result);
        } else {
            System.out.println("Element is not found");
        }
    }
}