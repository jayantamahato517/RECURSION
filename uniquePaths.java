class uniquePaths{
    public static int countPaths(int i, int j, int m , int n){
        //base case
        //if destination is reached
        if(i == m-1 && j == n-1){
            return 1;
        }
        //if out of boundary
        if(i >= m || j >= n){
            return 0;
        }
        //move down + move right
        return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int result = countPaths(0,0,m, n);
        System.out.println("Uniue Paths : " + result);
    }
}