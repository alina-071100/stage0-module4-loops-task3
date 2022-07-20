package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
            int result = 0;
            int n = 9;
            for (int i = 1; i <=lengthOfLastNumber; i++){
                result = result +n;
                n = (n * 10) + 9;
            }
        System.out.println(result);

    }
}

