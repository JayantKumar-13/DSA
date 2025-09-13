public class Strings_Comparision {
    public static void main(String[] args) {
        String S1 = "Tony";
        String S2 = "Tony";
        String S3 = new String("Tony");
        if(S1==S2){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(S1==S3){
            System.out.println("Strings are Equal");  // Here it gives strings are not equal because agar hmlog new se string banate h to alag memory me store hota h
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(S1.equals(S3)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
