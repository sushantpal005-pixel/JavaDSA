public class BasicMaths {

    static void printDigits(int num) {
        while(num != 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }

    static void countsDigits(int num) {
        int count = 0;
        while(num != 0){
            int digit = num % 10;
            count = count +1;
            num = num/10;
        }
        System.out.println(count);
    }
    static void sumOfDigits(int num) {
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println(sum);
    }

    static int reverse(int num) {
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }
        return rev;
    }
    static  boolean isPalindrome(int num){
        int orgNum = num;
        int revNum = reverse(num);
        if(revNum == orgNum){
            return true;
        }
        return false;
    }
    static boolean isPrime(int num){
        for (int i = 2; i <= num-1; i++) {
            int rem = num%i;
            if(rem == 0){
                return false;
            }
        }
        return true;
    }
    static int getGCD(int a, int b){
        //gcd(a, b) = gcd(b, a%b);
        while(b != 0) {
            int oldValueOfb = b;
            b = a%b;
            a = oldValueOfb;
        }
        int ans = a;
        return ans;
    }

    static int getLCM(int a, int b){
        int gcd = getGCD(a, b);
        //gcd(18,12) = 6
        int prod = a*b;
        //prod(a,b) -> 216
        int lcm = prod/gcd;
        //216/6
        return lcm;
    }
    static boolean isArmstrong(int num){
        int orgNum = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum = sum + digit*digit*digit;
            num = num / 10;
        }
        if(sum == orgNum){
            return true;
        }
        return false;
    }

    static boolean checkPerfectNumber(int num){
        int sum = 1;
        for (int i = 2; i*i<=num ; i++) {
            if(num % i == 0){
                //i ne num ko perfectly divide krdiya h
                //to ab factor pair kya bnega
                //agr phla factor i hai to dusra factor num/i
                //1st factor -> i
                //2nd factor -> num/i
                int firstFactor = i;
                int secondFactor = num/firstFactor;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
    static void printAllPrime(int n){
        //print all prime no. from 1 to n
        //1 is not a prime
        for (int i = 2; i < n; i++) {
            boolean isPrime = isPrime(i);
            if(isPrime == true){
                System.out.println(i);
            }

        }
//        int n = 5;
//        for (int i = 2; i*i<=n ; i++) {
//            if (n%i == 0) {
//                return false;
//            }
//        }
//        return true;
    }
    
    static void main() {
        //printDigits(5432);
        //countsDigits(78549898);
        //sumOfDigits(6514);
        //System.out.println(reverse(7812));
        //System.out.println(isPalindrome(1232));
        //System.out.println(isPrime(5));
        //System.out.println(getGCD(18, 12));
        //System.out.println(getLCM(18, 12));
        //System.out.println(isArmstrong(121));
        //System.out.println(checkPerfectNumber(6));
        printAllPrime(10);
    }
}
