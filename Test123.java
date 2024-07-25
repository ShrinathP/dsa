package e2e.cbr.validation;

import org.apache.kafka.common.protocol.types.Field;
import scala.Int;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.HashSet;

public class Test123 {

    public static void main(String[] args) {
        //shorttestSubstring("dabbcacbbbbbd");
        shorttestSubstring("dabbcacbd");

    }


    public static boolean containsAllChars(String str, HashMap hm) {
        HashSet hs = new HashSet();
        for(int i=0; i< str.length(); i++){
            hs.add(str.charAt(i));
        }

        if(hs.size() == hm.keySet().size()) {
            return true;
        }
        return false;
    }

    public static void shorttestSubstring(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }


        int min = Integer.MAX_VALUE;
        String res = "";
        for(int i=0; i<s.length() ; i++) {
            for(int j = i+1; j<s.length() + 1; j++) {
                String currentString = s.substring(i, j);

                System.out.println( i + "" + j);
                if(containsAllChars(currentString, hm)) {


                    if (currentString.length() < min) {
                        min = currentString.length();
                        res = currentString;
                    }
                }
            }


        }

        System.out.println(res);


    }
}
