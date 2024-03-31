import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int score = 0;
        while(k-->0){
            Arrays.sort(nums);
            score+=nums[nums.length-1];
            if(nums[nums.length-1]%3==0){
                nums[nums.length-1] /=3;
            } else{
                nums[nums.length-1] = (int)nums[nums.length-1]/3 + 1;
            }
        }
        System.out.println(score);
    }
}
