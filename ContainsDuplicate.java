package HashMap;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {

        //Scanner scn=new Scanner(System.in);
        int[] nums={1,2,3,4};
        int count=0;
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],i);
                count++;
               break;
            }
            else{
                hm.put(nums[i],i);
            }

        }
        if(count >0){
            // return true;
            System.out.println(true);
        }
        else{
            //return false;
            System.out.println(false);
        }
}}
