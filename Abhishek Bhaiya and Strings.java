import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char ch = '0';
        int flip = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)!=ch){
                flip++;
                if(ch=='0'){
                    ch='1';
                } else{
                    ch='0';
                }
            }
        }
        System.out.println(flip);
    }
}
