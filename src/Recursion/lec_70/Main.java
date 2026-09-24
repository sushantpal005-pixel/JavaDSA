package Recursion.lec_70;
import java.util.*;

public class Main {
    static void solve(String s, String output, ArrayList<String> ans){
        //agr meri input string or remaining string empty ayyi h,
        //iska mtlb output string me permutation ready h
        //use ans wali list me store krlo or chlo vapas
        //base case
        if(s.isEmpty()){
            ans.add(output);
            return;
        }
        //hr character ko current postiton pr try krke dekho
        //baki recursion ko dedo
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            String remString = s.substring(0, i) + s.substring(i+1);
            //baki recursion dekhlega
            solve(remString, output + ch, ans);
        }
    }
    public ArrayList<String> permutation(String s) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        solve(s, "", ans);
        Collections.sort(ans);
        return ans;
    }
}
