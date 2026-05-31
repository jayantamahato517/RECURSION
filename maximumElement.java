public class maximumElement {
    public static int max(int arr[], int index){
        if(index == arr.length-1){
            return arr[index];
        }
        //recursive call
        int smallMax = max(arr, index+1);

        //compare current element with remaining maximum
        return Math.max(arr[index], smallMax);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(max(arr,0));
    }
}