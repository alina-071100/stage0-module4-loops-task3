package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if(t <0) {
            t = -1 * t;
        }
        String tempLength = "" + t;
        int result =  0;
        for (int i = 0; i <= tempLength.length() ; i++) {
            result = result + t % 10;
            t = t / 10;
        }
        System.out.println(result);

    }
    }
