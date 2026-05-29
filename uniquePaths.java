class uniquePaths{
    public static int UniquePaths(int m , int n){
        if(m == 1 || n == 1){
            return 1;
        }
        return UniquePaths(m-1, n) + UniquePaths(m, n-1);
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(UniquePaths(m, n));
    }
}