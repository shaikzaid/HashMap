package HashMap;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String a= "aab";
        String b= "bah";
        HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<a.length();i++){
           if(hm.containsKey(a.charAt(i))){
           hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
           }
           else{
               hm.put(a.charAt(i),1);
           }
       }
       for(int i=0;i<b.length();i++){
           if(hm.containsKey(b.charAt(i))){
            hm.put(b.charAt(i),hm.get(b.charAt(i))-1);
            if(hm.get(b.charAt(i))== 0){
                hm.remove(b.charAt(i));
             }
           }

       }
       if(hm.isEmpty()){
           System.out.println("true");
       }
       else {
           System.out.println("false");
       }

    }
}
