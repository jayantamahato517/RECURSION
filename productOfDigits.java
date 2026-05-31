public class productOfDigits {
    public static int productOfDigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * productOfDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(productOfDigit(n));
    }
}
