package Recursion.lec_72;
import java.util.*;
public class Main {
    static void solve(String digits, int index, String[] mapping, List<String> result, StringBuilder output){
        //base case -> jaise hi index input string ke bahar nikl jayega,
        //iska mtlb, output string ready h to push inside result wali list
        if(index >= digits.length()){
            result.add(output.toString());
            return;
        }
        //ek case mujhe solve krna h, iska mtlb ek block mai fill kr deta hu
        //and baki recursion sambhal lega
        int value = digits.charAt(index) - '0';
        String mappedString = mapping[value];
        //ex -> value = 5, mappedString = "jkl"
        //current value and uski mapped string mere pas ready h
        //current block pr usse rakh dete h and baki recursion ko de denge
        for(int i = 0; i < mappedString.length(); i++){
            output.append(mappedString.charAt(i));
            solve(digits, index + 1, mapping, result, output);
            //backtracking or undo step
            output.deleteCharAt(output.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        int index = 0;
        StringBuilder output = new StringBuilder();
        solve(digits, index, mapping, result, output);
        return result;
    }
}
