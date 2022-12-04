package transport.driver;

import java.util.Objects;

import static transport.ValidateUtils.validateInt;
import static transport.ValidateUtils.validateString;

public abstract class Driver {

    private final String name;
    private boolean certificate;
    private int experience;
    String attention = "default";
    public Driver(String name, boolean certificate, int experience) {
        this.name = validateString (name, attention);
        this.certificate = certificate;
        setExperience(experience);

    }


    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();

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
        this.experience = validateInt (experience, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return certificate == driver.certificate && experience == driver.experience && Objects.equals(name, driver.name) && Objects.equals(attention, driver.attention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, certificate, experience, attention);
    }

    @Override
    public String toString() {
        return "Водитель " + name +
                ", наличие прав " + certificate +", "+ experience + " лет за рулем";
    }
}