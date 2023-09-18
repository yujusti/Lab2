import java.util.List;

public class DataTypes {
    // TODO TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static long sum(List<Integer> numbers) {
        long sum = 0;
        // below is a "foreach" loop which iterates through numbers
        for (Integer x : numbers)
            sum += x;
        return sum;
    }
}
