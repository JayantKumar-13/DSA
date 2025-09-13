public class Strings {

    public static void main(String[] args) {
        String str = "abcd";
        String str2 = new String("xyz"); 
        System.out.println(str);

        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        System.out.println(sb);
    }
}