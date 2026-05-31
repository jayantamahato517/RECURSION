public class sumOfDigits {
    public static int sumDigits(int n){

        //base case
        if(n == 0){
            return 0;
        }
        //Recursive call
        return (n % 10) + sumDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumDigits(n));
    }
}
