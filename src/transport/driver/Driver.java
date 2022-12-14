package transport.driver;

import java.util.Objects;

import static transport.ValidateUtils.validateInt;
import static transport.ValidateUtils.validateString;

public abstract class Driver<T> {

    private final String name;
    private boolean certificate;
    private int experience;
    private C category;
    String attention = "default";

    public Driver(String name, boolean certificate, int experience) {
        this.name = validateString(name, attention);
        this.certificate = certificate;
        setExperience(experience);
        setCategory(category);

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
        this.experience = validateInt(experience, 0);
    }

    public boolean isCertificate() {
        return certificate;
    }

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.category = category;
    }

    public enum C {
        A,
        B,
        C,
        D,
        E;
    }

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
            return "Водитель " + name +
                    ", наличие прав " + certificate + ", " + experience + " лет за рулем";
        }
    }