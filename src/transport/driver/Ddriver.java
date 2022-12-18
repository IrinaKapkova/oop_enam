package transport.driver;
import transport.Bus;

public class Ddriver extends Driver<Bus> {

    public Ddriver(String name, boolean certificate, int experience) {
        super(name, certificate, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель " + getName() + " стартовал");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель " + getName() + " финишировал");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель " + getName() + " заправляет машину");
    }

}

