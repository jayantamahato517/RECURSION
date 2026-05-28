public class nthStair {
    public static int printNthStair(int n){
        if(n == 1 || n == 2){
            return n;
        }
        return printNthStair(n-1) + printNthStair(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(printNthStair(n));
    }
}
