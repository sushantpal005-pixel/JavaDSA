package Strings.lec_52;
import java.util.HashMap;

public class Main {
    //remove all occurrences of a substring
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index+part.length());
        }
        return s;
    }
    //Permutation in String
        static boolean checkInclusion(String s1, String s2) {
            if(s1.length() > s2.length()){
                return false;
            }
            HashMap<Character, Integer> hashS1 = new HashMap<>();
            for(int j = 0; j < s1.length(); j++){
                hashS1.put(s1.charAt(j), hashS1.getOrDefault(s1.charAt(j), 0) + 1);
            }

            int i = 0;
            int windowLength = s1.length();
            HashMap<Character, Integer> hashS2 = new HashMap<>();
            for(i = 0; i < windowLength; i++){
                hashS2.put(s2.charAt(i), hashS2.getOrDefault(s2.charAt(i), 0) + 1);
            }

            if(hashS1.equals(hashS2)){
                return true;
            }
            else{
                while(i < s2.length()){
                    char newChar = s2.charAt(i);
                    hashS2.put(s2.charAt(i), hashS2.getOrDefault(s2.charAt(i), 0) + 1);

                    char oldChar = s2.charAt(i - windowLength);
                    hashS2.put(oldChar, hashS2.get(oldChar) - 1);

                    if (hashS2.get(oldChar) == 0) {
                        hashS2.remove(oldChar);
                    }

                    if(hashS1.equals(hashS2)){
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }
}

