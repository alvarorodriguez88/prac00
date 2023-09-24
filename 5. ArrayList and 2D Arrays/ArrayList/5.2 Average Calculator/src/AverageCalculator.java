import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        int length = numbers.size();
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / length;
    }
}