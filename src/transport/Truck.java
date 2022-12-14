package transport;

import static transport.ValidateUtils.getRandomInt;

public class Truck extends Transport implements Competing {
    private final TypeOfCarrying typeOfCarrying;

    public Truck(String brand, String model, float engineVolume, TypeOfCarrying typeOfCarrying) {
        super(brand, model, engineVolume);
        this.typeOfCarrying = typeOfCarrying;
    }

    public TypeOfCarrying getTypeOfCarrying() {
        return typeOfCarrying;
    }

    @Override
    public void startMoving() {
        System.out.printf("%s %s начинает движение  \n", getBrand(), getModel());
    }

    @Override
    public void finishTheMove() {
        System.out.printf("%s %s заканчивает движение  \n", getBrand(), getModel());
    }

    @Override
    public boolean goDiagnosed() {
        return Math.random() > 0.5;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " отремонтирован");
    }


    @Override
    public void printType() {
        if (typeOfCarrying == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = typeOfCarrying.getFrom() == null ? "" : " от " + typeOfCarrying.getFrom() + " тн ";
            String to = typeOfCarrying.getTo() == null ? "" : " до " + typeOfCarrying.getTo() + " тн ";
            System.out.println("Грузоподъемность авто:" + from + to);
        }
    }

    @Override
    public String toString() {
        printType();
        return "Грузовой автомобиль " + getBrand() + " " + getModel()
                + ", объем двигателя: " + getEngineVolume() + " литров.";
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s на пит-стопе \n", getBrand(), getModel());
    }

    @Override
    public void getBestTimeLap() {
        System.out.println("У " + getBrand() + " " + getModel() + "лучшее время круга " + getRandomInt(1, 15) + " минут " + getRandomInt(0, 59) + " секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("У " + getBrand() + " " + getModel() + "максимальная скорость  достигла " + getRandomInt(120, 120) + " км в час");
    }

    public enum TypeOfCarrying {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private final Float from;
        private final Float to;

        TypeOfCarrying(Float from, Float to) {
            this.from = from;
            this.to = to;
        }

        public Float getFrom() {
            return from;
        }

        public Float getTo() {
            return to;
        }
    }
}