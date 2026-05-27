public class reverse {
    static int rev = 0;
    public static void reverseNumber(int n){
        // int rev = 0;
        if(n ==0){
            return;
        }
        int digit = n % 10;
        rev = rev * 10 + digit;

        reverseNumber(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        reverseNumber(n);
        System.out.println("Reversed number is : " + rev);
    }
}
