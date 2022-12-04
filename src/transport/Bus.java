package transport;

import static transport.ValidateUtils.getRandomInt;

public class Bus extends Transport implements Competing {
    private  final Volume volume;
    public Bus(String brand, String model, float engineVolume,  Volume volume) {
        super(brand, model, engineVolume);
        this.volume=volume;
    }
    public void printType() {
        if (this.volume == null) {
            System.out.println("Информации недостаточно");
        } else {
            System.out.println("Вместимость автобуса: " + this.volume);
        }
    }
    @Override
    public String toString() {
        return "Автобус " + super.toString()+ getVolume();
    }

    public Volume getVolume() {
        return volume;
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
    public void pitStop() {
        System.out.printf("%s %s на пит-стопе \n", getBrand(), getModel());
    }

    @Override
    public void getBestTimeLap() {
        System.out.println("У "+getBrand()+" "+getModel() +"лучшее время круга " + getRandomInt(1,17) + " минут "+ getRandomInt(0,59) + " секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("У "+getBrand()+" "+getModel() +"максимальная скорость  достигла " + getRandomInt(100,100) + " км в час");
    }
    public enum Volume{
        SUPER_SMALL(null, 10),
        SMALL(null, 25),
        MIDDLE(40, 50),
        BIG(60, 80),
        SUPER_BIG(100, 120);

        private final Integer from;
        private final Integer to;

        Volume (Integer from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            String from1 = from != null ? " от " + from : "данных по автобусу недостаточно";
            String to1 = to != null ? " до " + to + " мест" : "данных по автобусу недостаточно";
            return "Вместимость " + from1 + to1;
        }
    }
}
