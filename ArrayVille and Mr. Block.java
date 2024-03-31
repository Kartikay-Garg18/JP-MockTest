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
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            } else{
                map.put(ele, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int removed = 0;
        for(int ele : list){
            if(ele>k) break;
            else{
                k-=ele;
                removed++;
            }
        }
        System.out.println(list.size()-removed);
    }
}
