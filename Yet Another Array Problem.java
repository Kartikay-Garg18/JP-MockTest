import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int i = nums.length-2;
        long result = 0;
        while(i>=0){
            if(nums[i]>nums[i+1]){
                int split = (int)Math.ceil((double)nums[i]/nums[i+1])-1;
                result+=split;
                nums[i] = Math.min(nums[i+1], nums[i]/(split+1));
            }
            i--;
        }
        System.out.println(result);
    }
}
