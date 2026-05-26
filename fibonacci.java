class fibonacci{
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int n = 5;

        for(int i =0;i<n;i++){
            System.out.print(fibo(i) + " ");
        }
    }
}


// method - 02

class fibonacci2{
    public static int fibo1(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fibo1(n-1);
        int f2 = fibo1(n-2);
        return f1 + f2;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo1(n));
    }
}