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
        int n = 10;
        reverseNumber(n);
        System.out.println("Reversed number is : " + rev);
    }
}


// method - 02

class Reverse{
    public static int Reverse(int n, int r){
        if(n == 0) return r;
        return Reverse(n/10, r*10+n%10);
    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println(Reverse(n,0));
    }
}
