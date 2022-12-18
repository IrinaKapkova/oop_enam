package transport.driver;

import transport.Transport;

import java.util.Objects;

import static transport.ValidateUtils.validateInt;
import static transport.ValidateUtils.validateString;

public abstract class Driver<T extends Transport> {

    private final String name;
    private boolean certificate;
    private int experience;
    String attention = "default";

    public Driver(String name, boolean certificate, int experience) {
        this.name = validateString(name, attention);
        this.certificate = certificate;
        setExperience(experience);

    }

    public final String getName() {
        return name;
    }

    public boolean certificate() {
        return certificate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = validateInt(experience, 0);
    }

    public boolean isCertificate() {
        return certificate;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<T> driver = (Driver<T>) o;
        return certificate == driver.certificate && experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(attention, driver.attention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, certificate, experience, attention);
    }

    @Override
    public String toString() {
        return name + ", " + experience + " лет за рулем";
    }
}