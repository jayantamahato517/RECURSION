class jay{
    public static int last(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = last(arr, key, i+1);

        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,7,8,1,54,36,7};
        int key = 1;
        System.out.println(last(arr, key, 0));
    }
}