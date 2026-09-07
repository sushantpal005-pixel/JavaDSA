package Recursion.lec_59;
import java.util.*;

public class Main {
    public static void getAllSubsequences(String s, int index, StringBuilder output, List<String> ans){
        if(index >= s.length()){
            String subsequence = output.toString();
            ans.add(subsequence);
            return;
        }

        //include exclude pattern
        char ch = s.charAt(index);
        //include
        output.append(ch);
        getAllSubsequences(s, index+1, output, ans);
        //exclude
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s, index+1, output, ans);
    }
    public static List<String> powerSet(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        int index = 0;

        getAllSubsequences(s, index, output, ans);
        Collections.sort(ans);
        return ans;
    }

    static void main() {
        System.out.println(powerSet("abc"));
    }
}
