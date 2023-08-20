package HashMap;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm= new HashMap<>();
        Character[] sq={'I','V','X','L','C','D','M'};
        //{"I","V","X","L","C","D","M","IV","IX","XL","XC","CD","CM"};
        int[] i1={1,5,10,50,100,500,1000,4,9,40,90,400,900};
        String s="III";
        char[] charArray = s.toCharArray();
        for(int i=0;i<sq.length;i++){
            hm.put(sq[i],i1[i]);
        }

        hm.put(s.charAt(s.length()-1),hm.get(s.charAt(s.length()-1)));
        int result=hm.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(hm.get(s.charAt(i))< hm.get(s.charAt(i+1))){
                result -= hm.get(s.charAt(i));
            }
            else{
                result +=hm.get(s.charAt(i));
            }
        }

        System.out.println(result);

    }
}
