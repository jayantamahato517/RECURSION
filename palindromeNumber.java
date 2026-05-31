class PalindromeNumber {

    static int reverse = 0;

    static boolean palindrome(int n) {

        int original = n;

        reverseNumber(n);

        return original == reverse;
    }

    static void reverseNumber(int n) {

        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + n % 10;

        reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        int n = 121;

        System.out.println(palindrome(n));
    }
}