public class countOfDigit {
    public static int countOfDigit(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countOfDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Count of digit is : " + countOfDigit(n));
    }
}
