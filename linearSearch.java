class search{
    public static int binaryS(int arr[] , int key){
        int start = 0, end = arr.length-1;

        while (start <= end){
            int mid = (start +end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                start = mid + 1;
            }else {
                end = end - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int key = 6;
        int result = binaryS(arr, key);

        if(result != -1){
            System.out.println("Element is found at index : " + result);
        } else {
            System.out.println("Element is not found");
        }
    }
}