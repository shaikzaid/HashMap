package HashMap;

import java.util.HashMap;

public class MajorityElementBF {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4};
        int max = 0;
        int result = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int temp = hm.get(nums[i]);
                hm.put(nums[i], temp + 1);
                if (max < temp) {
                    max = temp;
                    result = nums[i];
                }
            } else {
                hm.put(nums[i], 1);
            }

        }
        System.out.println(result);
    }
}
