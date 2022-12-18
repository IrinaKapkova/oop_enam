package transport.driver;

import transport.Car;

public class Bdriver extends Driver<Car> {

    public Bdriver(String name, boolean certificate, int experience) {
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
