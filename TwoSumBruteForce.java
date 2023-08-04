package HashMap;

import java.util.Scanner;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        int lengtharr= scn.nextInt();
        int[] nums= new int[lengtharr];

        for(int i=0;i<nums.length;i++){
            nums[i]=scn.nextInt();
        }
        int target = scn.nextInt();

        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == target && nums[j] ==0){
                    result[0]=i;
                    result[1]=j;

                }
                else if(nums[i] + nums[j]== target){
                    result[0]=i;
                    result[1]=j;


                }
            }


        }
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
//        return result;
    }
}
