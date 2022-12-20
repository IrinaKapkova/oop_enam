package calculation;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Calculation> calculations = new HashSet<>();
        while (calculations.size() < 15) {
            calculations.add(new Calculation(random.nextInt(10), random.nextInt(10)));
        }
        System.out.println(calculations);
    }
}