package transport;

public class ValidateUtils {

    public static String validateString(String value, String value2) {
        return value == null || value.isBlank() || value.isEmpty() || value.trim().length() == 0 ? value2 : value;
    }
    public static Integer validateInteger(Integer value, Integer value2) {
        return (value== null|| value<=0)? value2 :value;
    }
    public static float validateFloat(float value, float value2) {
        return value<=0? value2: value;
    }
    public static int validateInt (int value, int value2) {
        return value<=0? value2: value;
    }
    public static int getRandomInt(int volue1, int volue2) {
        return (int) (volue1+Math.random() * volue2);
    }
}