class jay{
    public static int jayanta(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * jayanta(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(jayanta(x, n));
    }
}