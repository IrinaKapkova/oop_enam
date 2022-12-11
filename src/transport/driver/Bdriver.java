package transport.driver;

import transport.Car;

public class Bdriver <B extends Car> extends Driver<B> {

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

    public void PrintRaceParticipants (B car) {
        System.out.printf("Водитель %s на  %s %s участвует в заезде\n", getName(), car.getBrand(), car.getModel());
    }

}
