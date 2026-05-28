public class gcd{
    public static int printGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return printGCD(b, a%b);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("Gcd of two numbers is : " + printGCD(a, b));
    }
}
