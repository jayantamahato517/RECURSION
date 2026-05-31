public class reverseString {
    public static String reverse(String str){
        if(str.length() == 0){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Jayanta";
        System.out.println(reverse(str));
    }
}
