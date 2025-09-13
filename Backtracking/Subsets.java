public class Subsets {
    public static void findSubsets(String str, String ans, int i){                   // TC is O(n * 2^n) and SC is O(n)
        if(i ==str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
            
        }
        findSubsets(str, ans+str.charAt(i), i+1);
        findSubsets(str, ans, i+1);
        
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
