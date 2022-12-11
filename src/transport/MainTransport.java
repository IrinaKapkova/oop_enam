package transport;


public class MainTransport {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7f, BodyType.SEDAN);
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8", 3.0f, BodyType.SEDAN);
        System.out.println(audiA8);
        Car bmvZ8 = new Car("BMW", "Z8", 3.0f, BodyType.SEDAN);
        System.out.println(bmvZ8);

        Bus zil1 = new Bus("ЗИЛ", "325010", 4.75f, Bus.Volume.SMALL);
        Bus zil2 = new Bus("ЗИЛ", "325000", 4.75f, Bus.Volume.SUPER_BIG);
        Bus zil3 = new Bus("ЗИЛ", "325010-04", 4.75f, Bus.Volume.SMALL);
        Truck kamaz1 = new Truck("Камаз", "43509", 12.9f, Truck.TypeOfCarrying.N3);
        Truck kamaz2 = new Truck("Камаз", "4326-9", 10.8f, Truck.TypeOfCarrying.N2);
        Truck maz = new Truck("Маз", "6440", 12.5f, Truck.TypeOfCarrying.N3);
        System.out.println(zil1);
        System.out.println(zil2);
        System.out.println(zil3);
        System.out.println(kamaz1);
        System.out.println(kamaz2);
        System.out.println(maz);
        Object goDiagnosed;
        goDiagnosed(ladaGranta, audiA8, bmvZ8, zil1, zil2, zil3, kamaz1, kamaz2, maz);
//        ladaGranta.pitStop();
//        ladaGranta.getBestTimeLap();
//        ladaGranta.getMaxSpeed();
//        ladaGranta.getBestTimeLap();
//        kamaz2.getBestTimeLap();
//        Bdriver<Car> ivanov = new Bdriver<>("Иванов Петр", true, 15);
//        Cdriver<Truck> sidorov = new Cdriver<>("Сидоров Иван", true, 12);
//        Ddriver<Bus> petrov = new Ddriver<>("Петров Семен", true, 9);
//        ivanov.PrintRaceParticipants(ladaGranta);
//        petrov.PrintRaceParticipants(zil1);
//        sidorov.PrintRaceParticipants(kamaz1);
//        sidorov.startMoving();
//        petrov.refuel();
//        ivanov.stopMoving();
//        System.out.println(petrov);

    }

    private static void goDiagnosed(Transport... transports) {
        for (Transport transport : transports) {
            goDiagnosedTransport(transport);
        }
    }

    private static void goDiagnosedTransport(Transport transport) {
        try {
            if (!transport.goDiagnosed()) {
                throw new RuntimeException(transport.getBrand() + " " +transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
