package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagramBruteForce {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s=scn.nextLine();
        String n= scn.nextLine();


        char[] char1=s.toCharArray();
        char[] char2=n.toCharArray();
        
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hm1=new HashMap<>();


        for(int i=0;i<char1.length;i++){
            if(hm.containsKey(char1[i])){
                int temp=hm.get(char1[i])+1;
                hm.put(char1[i],temp);}
            else {
                hm.put(char1[i],1);
            }
        }


        for(int i=0;i<char2.length;i++) {
            if (hm1.containsKey(char2[i])) {
                int temp = hm1.get(char2[i]) + 1;
                hm1.put(char2[i], temp);
            } else {
                hm1.put(char2[i], 1);
            }
        }
        int count=0;
        for(char key : hm.keySet()){
            if(hm1.containsKey(key) && hm.containsKey(key)){
                int a= hm.get(key);
                int b=hm1.get(key);
                if(a!=b){
                    count++;
                    //  System.out.println(false);
                    break;
                }
            }
            else{
                count++;
                break;
            }
        }

        if(count >0){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
}}
