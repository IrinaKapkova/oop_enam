package transport;

import static transport.ValidateUtils.getRandomInt;

public class Bus extends Transport implements Competing {
    private final Volume volume;

    public Bus(String brand, String model, float engineVolume, Volume volume) {
        super(brand, model, engineVolume);
        this.volume = volume;
    }

    public void printType() {
        if (volume == null) {
            System.out.println("Данных по авто  недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + volume.getFrom() + " до " + volume.getTo());
        }
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
    public boolean goDiagnosed() {
        System.out.println(" “Автобусу "+ getBrand()+" "+getModel()+" диагностика не требуется");
        return true;
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s на пит-стопе \n", getBrand(), getModel());
    }

    @Override
    public void getBestTimeLap() {
        System.out.println("У " + getBrand() + " " + getModel() + "лучшее время круга " + getRandomInt(1, 17) + " минут " + getRandomInt(0, 59) + " секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("У " + getBrand() + " " + getModel() + "максимальная скорость  достигла " + getRandomInt(100, 100) + " км в час");
    }

    public enum Volume {
        SUPER_SMALL(null, 10),
        SMALL(11, 25),
        MIDDLE(40, 50),
        BIG(60, 80),
        SUPER_BIG(100, 120);

        private final Integer from;
        private final Integer to;

        Volume(Integer from, int to) {
            this.from = from;
            this.to = to;
        }

        public Integer getFrom() {
            return from;
        }

        public Integer getTo() {
            return to;
        }

    }

    public void printVolume() {
        String from1 = volume.getFrom() != null ? " от " + volume.getFrom() : "данных по автобусу недостаточно";
        String to1 = volume.getTo() != null ? " до " + volume.getTo() + " мест" : "данных по автобусу недостаточно";
        System.out.println("Автобус " + super.toString() + " Вместимость " + from1 + to1);
    }

    public String toString() {
        printVolume();
        return null;
    }
}
