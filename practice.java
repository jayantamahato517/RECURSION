import java.util.Scanner;

class jay{
    public static int bin(int a , int b){
        if(b == 0){
            return a;
        }
        return bin(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.println("The gcd of a and b is : " + bin(a, b));
    }
}