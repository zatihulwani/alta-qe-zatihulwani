public class Mean {

    // Problem 6B - Mean
    private static float Mean(float[] numbers) {
       float total = 0;
       for ( int i = 0; i < numbers.length; i++)
           total += numbers[i];
       float value = total/numbers.length;
        return value;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
