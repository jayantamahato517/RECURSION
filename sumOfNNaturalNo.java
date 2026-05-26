public class sumOfNNaturalNo {
    public static int sum(int n){
        if(n == 1){
            return 1;
        } else {
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum is : " + result);
    }
}


//Optimal solution

class optimal{
    public static int sum1(int n){
        return n * (n+1)/2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum1(n));
    }
}
