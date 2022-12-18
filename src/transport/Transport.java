package transport;

import transport.driver.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static transport.ValidateUtils.*;

public abstract class Transport {
    private  String  brand;
    private  String model;
    private float engineVolume;
    private final List<Driver<?>> drivers= new ArrayList<>();
    private final List<Mechanic<?>> mechanics= new ArrayList<>();
    private final List<Sponsor> sponsors= new ArrayList<>();


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
    public abstract void printType();
@Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
    public void addDriver(Driver<?>...drivers){
    this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?> ...mechanics){

    this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addSponsor(Sponsor...sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();
    public abstract void finishTheMove();
    public abstract boolean goDiagnosed();

    public abstract void repair();
}
