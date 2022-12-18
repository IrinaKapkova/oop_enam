package transport.driver;

import transport.Truck;

public class Cdriver extends Driver<Truck> {

    public Cdriver(String name, boolean certificate, int experience) {
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

