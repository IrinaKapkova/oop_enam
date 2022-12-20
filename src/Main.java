import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(number -> number % 2 == 1);
    }
}