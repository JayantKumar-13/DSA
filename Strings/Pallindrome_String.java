public class Pallindrome_String {

    public static boolean isPallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n= str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){ 
                System.out.println("string is not a pallindrome");             // condition for not a pallindrome
                return false;
            }
        }
        System.out.println("string is pallindrome");
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        isPallindrome(str);
    }
}