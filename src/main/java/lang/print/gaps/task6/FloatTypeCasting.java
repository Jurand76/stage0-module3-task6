package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        float result;
        result = Math.round(numberToBeRounded);
        int result_final = (int)result;
        System.out.println(result_final);
    }
}
