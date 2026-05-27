public class decreaseAndIncrease {
    public static void decAndInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decAndInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
        decAndInc(n);
    }
}
