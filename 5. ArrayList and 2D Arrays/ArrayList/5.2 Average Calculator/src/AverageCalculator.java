import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        if (numbers.isEmpty()) {
            return 0.0; // Handle the case of an empty list
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average as a double with decimal digits
        double average = (double) sum / numbers.size();

        return average;
    }
}