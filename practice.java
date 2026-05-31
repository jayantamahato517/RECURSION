class jay{
    public static String reverseString(String str){
        if(str.length() == 0){
            return str;
        }
        return reverseString(str.substring(1)) + (str.charAt(0));
    }
    public static void main(String[] args) {
        String str = "jaya";
        System.out.println(reverseString(str));
    }
}