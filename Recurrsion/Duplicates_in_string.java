public class Duplicates_in_string {
    public static void removeDupliates(String str, boolean map[],int i, StringBuilder newStr){
        if(i == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar -'a'] == true){
            removeDupliates(str, map, i+1, newStr);
        }
        else{
            map[currChar-'a'] = true;
            removeDupliates(str, map, i+1, newStr.append(currChar));
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        int i=0;
        removeDupliates(str, new boolean[26], i,new StringBuilder(""));
    }
}    