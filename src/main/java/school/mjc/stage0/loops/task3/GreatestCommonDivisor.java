package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public static void printGCD(int first, int second) {
        int gcd = 1;
        if (first == 0) {
            System.out.println(second);
        } else {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            System.out.println(gcd);
        }
    }

    public static void main(String[] args) {
        printGCD(0, 30);
    }
}
