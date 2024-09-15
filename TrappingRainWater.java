public class TrappingRainWater {
    public static int trapped_water(int height[]) {
        int n=height.length;
        //calculate left max boundary (L to R)
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){ //from i=1 because on prev line start from 0
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary (R to L)
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){  //from i=n-2 because on prev line start from n-1
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterLevel=min(leftmax bound,rightmax bound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //trapped water=waterLevel-height[i]
            trappedWater+=waterLevel-height[i];
        }
        
        return trappedWater;

    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapped_water(height));
    }
}
