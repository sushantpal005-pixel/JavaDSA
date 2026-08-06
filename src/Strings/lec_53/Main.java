package Strings.lec_53;

public class Main {
    //String compression
    static int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
        while (readIndex < chars.length) {
            char currChar = chars[readIndex];
            int count = 0;
            while (readIndex < chars.length && currChar == chars[readIndex]) {
                readIndex++;
                count++;
            }

            chars[writeIndex] = currChar;
            writeIndex++;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char digit : countStr.toCharArray()) {
                    chars[writeIndex] = digit;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }

    //Remove all adjacent duplicates element in string
    static String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ans.length() > 0 && ans.charAt(ans.length()-1) == ch){
                ans.deleteCharAt(ans.length() - 1);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

}
