import java.util.*;
public class Trapped_RainWater {                             // TC of  this code is O(n)
    public static int TrappingRainWater(int height[]){
        int Leftmax[]= new int[height.length];               // calculate left max boundary array
        Leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            Leftmax[i] = Math.max(height[i],Leftmax[i-1]);
        }
        int Rightmax[]= new int[height.length];             // calculate right max boundary array
        Rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length -2;i>=0;i--){
            Rightmax[i] = Math.max(height[i], Rightmax[i+1]);
        }
        int TrappedWater = 0;
        for(int i=0;i<height.length;i++){
            int WaterLevel = Math.min(Leftmax[i], Rightmax[i]);
            TrappedWater += WaterLevel - height[i];
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TrappingRainWater(height));
    }
}
