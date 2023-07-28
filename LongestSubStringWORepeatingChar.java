package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStringWORepeatingChar {
    public static void main(String[] args) {
        // time complexity- O(n^2) space O(n)

        Scanner scn = new Scanner(System.in);

        String S = scn.nextLine();
        // int[] arr=new int[S.length()];
        int max = 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            int count = 0;
            for (int j = i; j < S.length(); j++) { //inner j loop should run from present i position and the longest run of j will
                                                     // be the max / answer
                if (!hm.containsKey(S.charAt(j))) {
                    hm.put(S.charAt(j), j);
                    count++;
                } else {
                    hm.clear();
                    break;
                }
            }
            max = Math.max(max, count);
        }
//        Arrays.sort(arr);
        // System.out.println(arr[arr.length-1]);
        System.out.println(max);

    }
}
