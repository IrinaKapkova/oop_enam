package transport;


import transport.driver.Bdriver;
import transport.driver.Cdriver;
import transport.driver.Ddriver;
import transport.driver.Driver;

import java.util.List;


public class MainTransport {
    public static void main(String[] args) {
        Sponsor avtolife1 = new Sponsor("Жизнь авто", 200000);
        Sponsor avtolife2 = new Sponsor("Жизнь авто", 200000);
        Car ladaGranta = new Car("Lada", "Granta", 1.7f, BodyType.SEDAN);
        ladaGranta.addDriver(new Bdriver("Семенов Семен", true, 17));
        ladaGranta.addMechanic(new Mechanic<Car>("Андрей", "Мехнов", "Жигули"));
        ladaGranta.addSponsor(new Sponsor("Автомир", 500000), avtolife1);
        ladaGranta.addSponsor(new Sponsor("Автомир", 500000), avtolife2);
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8", 3.0f, BodyType.SEDAN);
        System.out.println(audiA8);
        Car bmvZ8 = new Car("BMW", "Z8", 3.0f, BodyType.SEDAN);
        System.out.println(bmvZ8);
        Bus zil1 = new Bus("ЗИЛ", "325010", 4.75f, Bus.Volume.SMALL);

        zil1.addMechanic(new Mechanic<Bus>("Семен", "Смехнов", "Зил"));
        zil1.addSponsor(new Sponsor("Автомасла", 300000), new Sponsor("Автозаправка", 200000));
        zil1.addDriver(new Ddriver("Павлов Павел", true, 10));

        Bus zil2 = new Bus("ЗИЛ", "325000", 4.75f, Bus.Volume.SUPER_BIG);
        Bus zil3 = new Bus("ЗИЛ", "325010-04", 4.75f, Bus.Volume.SMALL);
        Truck kamaz1 = new Truck("Камаз", "43509", 12.9f, Truck.TypeOfCarrying.N3);
        Truck kamaz2 = new Truck("Камаз", "4326-9", 10.8f, Truck.TypeOfCarrying.N2);
        Truck maz = new Truck("Маз", "6440", 12.5f, Truck.TypeOfCarrying.N3);

        maz.addMechanic(new Mechanic<Truck>("Михайл", "Мишин", "Маз"));
        maz.addSponsor(new Sponsor("Маз", 1000000));
        maz.addDriver(new Cdriver("Климов Артем", true, 7));
        System.out.println(zil1);
        System.out.println(zil2);
        System.out.println(zil3);
        System.out.println(kamaz1);
        System.out.println(kamaz2);
        System.out.println(maz);
        Object goDiagnosed;
        goDiagnosed(ladaGranta, audiA8, bmvZ8, zil1, zil2, zil3, kamaz1, kamaz2, maz);
        List<Transport> transports = List.of(ladaGranta, zil1, maz);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(ladaGranta);
        serviceStation.addTruck(maz);
        serviceStation.service();
        serviceStation.service();
        for (Transport transport : transports) {
            printInfoAll(transport);
        }
//        ladaGranta.pitStop();
//        ladaGranta.getBestTimeLap();
//        ladaGranta.getMaxSpeed();
//        ladaGranta.getBestTimeLap();
//        kamaz2.getBestTimeLap();
//        Cdriver<Truck> sidorov = new Cdriver<>("Сидоров Иван", true, 12);
//        ivanov.PrintRaceParticipants(ladaGranta);
//        petrov.PrintRaceParticipants(zil1);
//        sidorov.PrintRaceParticipants(kamaz1);
//        sidorov.startMoving();
//        petrov.refuel();
//        ivanov.stopMoving();
//        System.out.println(petrov);

    }

    private static void printInfoAll(Transport transport) {
        System.out.printf("Автомобиль %s %s. \n Водители: ", transport.getBrand(), transport.getModel());
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver);
        }
        System.out.print("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic);
        }
        System.out.print("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor);
        }
    }

    private static void goDiagnosed(Transport... transports) {
        for (Transport transport : transports) {
            goDiagnosedTransport(transport);
        }
    }

    private static void goDiagnosedTransport(Transport transport) {
        try {
            if (!transport.goDiagnosed()) {
                throw new RuntimeException(transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
