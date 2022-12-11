package transport;

import static transport.ValidateUtils.getRandomInt;

public class Car extends Transport implements Competing {
    private final BodyType bodyType;
    public Car(String brand, String model, float engineVolume, BodyType bodyType) {

        super(brand, model, engineVolume);
        this.bodyType=bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
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
        return Math.random()>0.5;
    }

    public void printType() {
        if (this.bodyType == null) {
            System.out.println("- Данных по авто недостаточно");
        } else {
            System.out.println("- Тип кузова : " + this.bodyType.getName());
        }
    }

    @Override
    public String toString() {
        System.out.println();
        printType();
        return "Легковой автомобиль " + getBrand() + " " + getModel()
                + " объем двигателя: " + getEngineVolume() + " литров. ";
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s на пит-стопе \n", getBrand(), getModel());
    }

    @Override
    public void getBestTimeLap() {
        System.out.println("У "+getBrand()+" "+getModel() +"лучшее время круга " + getRandomInt(1,10) + " минут "+ getRandomInt(0,59) + " секунд");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("У "+getBrand()+" "+getModel() +"максимальная скорость  достигла " + getRandomInt(120,150) + " км в час");
    }

}