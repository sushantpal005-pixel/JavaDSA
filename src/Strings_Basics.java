import java.util.Scanner;

public class Strings_Basics {

    static void printString(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    static int strLength(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    static int getVowelsCount(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    static String reverse(String str){
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    static boolean isPalindrome(String str){
        String orgString = str;
        String rev = reverse(str);
        if(!rev.equals(orgString)){
            return false;
        }
        return true;
    }

    static void main() {

        String str = "madam";
        System.out.println(isPalindrome(str));
//        System.out.println(getVowelsCount(str));
//        System.out.println(strLength(str));
//        printString(str);

//        String name = "Sushant";
//        name = name.replace('S', 's');
//        System.out.println(name);




//        String input = "My,name,is,Sushant";
//        String[] words = input.split(",");
//        for (String ch : words){
//            System.out.println(ch);
//        }


//        String name = "Sushant";
//        char[] crr = name.toCharArray();
//        for (char ch : crr){
//            System.out.println("Value of Char: " + (char)ch);
//        }



//        String name = "Sushant Pal";
//        System.out.println(name.startsWith("Sushant P"));
//        System.out.println(name.endsWith("Pal"));


//        int num = 7634;
//        String str = String.valueOf(num);
//        System.out.println(num + 1);
//        System.out.println(str + 1);


        //String str = "My Name is Sushant Pal";
        //beginIndex -> 3 -> inclusive
        //endIndex -> 6 -> exclusive
        //System.out.println(str.substring(3, 7));
        //System.out.println(str.contains("Sushant"));


        //empty - > length = 0
        //blank - > empty or sirf spaces h string me
//        String str = "  ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String name = "  Sushant    ";
//        System.out.println(name.length());
//        name = name.trim();
//        System.out.println(name.length());


//        String name = "sushant";
//        System.out.println(name.toUpperCase());
//        String str = "SUSHANT";
//        System.out.println(str.toLowerCase());


//        String str= "Sushant";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        String name = "SUSHANT";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));




//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String");
//        String str = sc.nextLine();
//        System.out.println("value: " + str);
//        System.out.println("Enter String");
//        String str2 = sc.next();
//        System.out.println("value of next: " + str2);







//        String name1 = "Sushant";
//        String name2 = "SUSHANT";
//
//        // == checks the reference not strings
//        // equals check the every character of string
//        // compares two string, ignoring lower case and upper case
//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("Both strings are equal");
//        }
//        else{
//            System.out.println("Both strings are not equal");
//        }



















//        String firstName = "Sushant";
//        String lastName = new String("Pal");
//        System.out.println(firstName + " " + lastName);
//        System.out.println(firstName.charAt(0));
//        System.out.println(firstName.length());

//        String name = "Sushant";
//        name = "Pal";                   // new string literal is creted in string pool
//        System.out.println(name);       // prints Pal bcoz reference is shifted


    }
}
