package transport;

import static transport.ValidateUtils.getRandomInt;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
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

}

