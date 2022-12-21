package transport;

import transport.driver.Driver;

import java.util.*;

import static transport.ValidateUtils.*;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();


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
        this.brand = validateString(brand, attention);
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
    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }
    public String toString() {
        return String.format(" %s  %s , объем дигателя %.2f литров.", getBrand(), getModel(), getEngineVolume());
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

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {

        this.mechanics.addAll(Arrays.asList(mechanics));
    }



    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract boolean goDiagnosed();

    public abstract void repair();
}
