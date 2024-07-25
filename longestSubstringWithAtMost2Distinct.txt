import java.util.*;
public class longestSubstringWithAtMost2Distinct{

//LONGEST SUBSTRING WITH AT MOST TWO DISTINCT CHARS
     public static void main(String []args){
        
        String s = "asddgterrhhrhhrddeww";
        Map<Character, Integer> map = new HashMap<>();
        int begin=0,end=0;
        int counter=0; //counting number of unique chars
        int maxLen=0;
        
        while(end< s.length()){
            char cEnd=s.charAt(end);
            map.put(cEnd, map.getOrDefault(cEnd, 0)+1);
            if(map.get(cEnd)==1){
                counter++;
                //new unique character
            }
            end++;
            
            //counter > 2 means we have found 3 unique chars
            //so we need to move the sliding window by 
            //moving the begin Index
            while(counter > 2){
                char cBegin = s.charAt(begin);
                map.put(cBegin, map.get(cBegin)-1); 
                //keep on reducing the frequency
                if(map.get(cBegin) == 0){
                    //reduce the counter once we remove the 
                    //3rd uniq character
                    counter --;
                }
                begin++;
                //move the begin pointer
            }
            
            maxLen = Math.max(maxLen, end - begin);
        }
        
        System.out.println(maxLen);
        
     }
}