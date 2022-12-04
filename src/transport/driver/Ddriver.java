package transport.driver;


import transport.Bus;

public class Ddriver <D extends Bus> extends Driver {

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

    public void PrintRaceParticipants (D car) {
        System.out.printf("Водитель %s на %s %s участвует в заезде\n", getName(), car.getBrand(), car.getModel());
    }
}

