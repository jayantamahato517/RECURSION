class jay{
    public static int maxE(int arr[], int index){
        if(index == arr.length-1){
            return arr[index];
        }
        int smallMax = maxE(arr, index+1);

        return Math.max(arr[index], smallMax);
    }
    public static void main(String[] args) {
        int arr[] = {3255,24,325,346,3532577,5,46,24627,62,366,243};
        System.out.println(maxE(arr, 0));
    }
}