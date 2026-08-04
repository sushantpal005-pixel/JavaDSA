package Strings.lec_51;

public class Main {
    static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >= 0){
            //remove all trailing spaces
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            //check value of i
            if(i < 0){
                break;
            }
            int j = i;
            //find the start index of the word
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            //jaise hi j space wale index pe aaaye, to ruk jao
            //or is word ko apne ans me append krdo
            ans.append(s.substring(j+1, i+1));
            //remove unwanted spaces where j is standing and add a space in ans
            while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }
            //j < 0 , iska mtlb first word k uper the mai -> no space needed
            //j >= 0 , space needed
            if(j >= 0){
                ans.append(" ");
            }
            //place i at last index of the remaining string
            i = j;
        }
        return ans.toString();
    }

    static char getMaxOccuringChar(String s){
        int[] freq = new int[26];
        //traverse over the string ans update their frequency accordingly
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            freq[currChar - 'a']++;
        }
        int maxFreq = -1;
        char ans = 'a';

        //traverse over the freq array and get the highest freq wala element
        for (int i = 0; i < 26; i++) {
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }

    static void main() {
        System.out.println(reverseWords("my name is sushant"));
        System.out.println(getMaxOccuringChar("sushant"));
    }
}
