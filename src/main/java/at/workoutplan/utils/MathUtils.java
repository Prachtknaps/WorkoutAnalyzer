package at.workoutplan.utils;

public class MathUtils {
    public static float truncateFloat(float value, int decimalPlaces) {
        float multiplier = (float) Math.pow(10, decimalPlaces);
        return ((int) (value * multiplier)) / multiplier;
    }
}
