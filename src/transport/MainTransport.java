package transport;

import transport.driver.Bdriver;
import transport.driver.Cdriver;
import transport.driver.Ddriver;

public class MainTransport {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta",  1.7f);
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8",  3.0f);
        System.out.println(audiA8);
        Car bmvZ8 = new Car("BMW", "Z8",  3.0f);
        System.out.println(bmvZ8);
//        Car kiaSportage4 = new Car("Kia", "Sportage 4-го поколения", 2.4f);
//        System.out.println(kiaSportage4);
//        Car hyundaiAvante = new Car("Hyundai", "Avante",  1.6f);
//        System.out.println(hyundaiAvante);
//        Train leningrad = new Train("Ленинград","B-901",38.8f,
//                301,30.45f, "от Белорусского вокзала", "до станции Минск-Пассажирский",11);
//        Train lastochka = new Train("Ласточка","D-125",38f,270,45.66f, "от Ленинградского вокзала", "до станции Ленинград-Пассажирский",8);
//        System.out.println(lastochka);
//        System.out.println(leningrad);

        Bus zil1 = new Bus("ЗИЛ","325010", 4.75f);
        Bus zil2 = new Bus("ЗИЛ","325000", 4.75f);
        Bus zil3 = new Bus("ЗИЛ","325010-04", 4.75f);
        Truck kamaz1 = new Truck("Камаз","43509", 12.9f);
        Truck kamaz2 = new Truck("Камаз","4326-9", 10.8f);
        Truck maz = new Truck("Маз","6440", 12.5f);
        System.out.println(zil1);
        System.out.println(zil2);
        System.out.println(zil3);
        System.out.println(kamaz1);
        System.out.println(kamaz2);
        System.out.println(maz);
        ladaGranta.pitStop();
        ladaGranta.getBestTimeLap();
        ladaGranta.getMaxSpeed();
        ladaGranta.getBestTimeLap();
        kamaz2.getBestTimeLap();
        Bdriver<Car> ivanov = new Bdriver<>("Иванов Петр", true, 15);
        Cdriver<Truck> sidorov = new Cdriver<>("Сидоров Иван", true, 12);
        Ddriver<Bus> petrov = new Ddriver<>("Петров Семен", true, 9);
        ivanov.PrintRaceParticipants(ladaGranta);
        petrov.PrintRaceParticipants(zil1);
        sidorov.PrintRaceParticipants(kamaz1);
        sidorov.startMoving();
        petrov.refuel();
        ivanov.stopMoving();
        System.out.println(petrov);

    }
}