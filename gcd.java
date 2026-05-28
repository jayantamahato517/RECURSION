public class gcd{
    public static int printGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return printGCD(b, a%b);
    }
    public static void main(String[] args) {
        int a = 16;
        int b = 28;
        System.out.println("Gcd of two numbers is : " + printGCD(a, b));
    }
}

// iterative version 

class jay{
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
