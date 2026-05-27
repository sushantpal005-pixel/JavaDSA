public class Operators {
    static void main() {
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        //Arithmetic operators
        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek/7;
        int remainder = solvedThisWeek%7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        //Relational operators
        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        //logical operators
        boolean completedDSA = true;
        boolean completedCore = false;
        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

        //assignment operators
        int ratingPoints = 100;

        ratingPoints += 20;
        System.out.println(ratingPoints);

        ratingPoints -= 10;
        System.out.println(ratingPoints);

        ratingPoints *= 2;
        System.out.println(ratingPoints);

        ratingPoints /= 4;
        System.out.println(ratingPoints);

        ratingPoints %= 30;
        System.out.println(ratingPoints);

        //unary operators
        int activeUsers = 100;
        int prefix = ++activeUsers;  //prefix = 101
        int postfix = activeUsers++;  //postfix = 101 but activeUsers = 102

        System.out.println(prefix);    //101
        System.out.println(postfix);   //101
        System.out.println(activeUsers); //102

    }
}
