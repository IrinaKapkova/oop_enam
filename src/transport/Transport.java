package transport;

import java.util.Objects;

import static transport.ValidateUtils.*;

public abstract class Transport {
    private  String  brand;
    private  String model;
    private float engineVolume;


    String attention = "default";

    public Transport(String brand, String model, float engineVolume) {

        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateString (brand, attention);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validateString(model, attention);
    }
    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = validateFloat(engineVolume, 0);
    }

    public String toString () {
        return String.format(" %s  %s , объем дигателя %.2f литров.", getBrand(), getModel(),getEngineVolume());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void startMoving();
    public abstract void finishTheMove();

}
