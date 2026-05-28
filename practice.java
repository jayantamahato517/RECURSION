class jay{
    public static int jayanta(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return jayanta(n-1) + jayanta(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(jayanta(n));
    }
}