public class Substrings {
    public static String subString(String str, int si, int ei){
        String Substr = "";
        for(int i=si;i<ei;i++){
            Substr += str.charAt(i);
        }
        return Substr;                       //  but in java there exists a pre defined function for substrings
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));
        System.out.println(subString(str,0, 5));
    }
}
