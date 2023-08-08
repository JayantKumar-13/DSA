import java.util.*;
public class BIntoDec {

    public static void BintoDec(int binNum){
        int decNum=0;
        int mynum=binNum;
        int pow=0;
        while(binNum>0){
            int LastDigit=binNum%10;
            decNum= decNum + (LastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum = binNum%10;


        }
        System.out.println("decimal of"+mynum+"="+decNum);
      }
      public static void main(String[] args) {
        BintoDec(101);
      }
}