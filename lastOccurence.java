public class lastOccurence{
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);

        if(isFound != -1){
            return isFound;
        }
        if(arr[i] == key){
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3};
        int key = 2;
        System.out.println("Last occurrence is : " + lastOccurence(arr, key, 0));
    }
}