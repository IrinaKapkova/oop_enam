package passport;

import java.time.LocalDate;
import java.util.Objects;
import static transport.ValidateUtils.validateString;

public class Passport {
    private String passportNumbers;
    private String surName;
    private String name;
    private String lastName;
    private LocalDate birthday;

    public Passport(String passportNumbers, String surName, String name, String lastName, LocalDate birthday) {
        setPassportNumbers (passportNumbers);
        this.surName = surName;
        setName (name);
        setLastName (lastName);
        setBirthday (birthday);
    }

    public String getPassportNumbers() {
        return passportNumbers;
    }

    public void setPassportNumbers(String passportNumbers) {
        this.passportNumbers = validateString(passportNumbers, "Заполните номер паспорта корректно!");
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = validateString(surName, "Заполните фамилию корректно!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateString(name, "Заполните имя корректно!");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumbers,passport.passportNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumbers);
    }

    @Override
    public String toString() {
        return "\nПаспорт " + passportNumbers +
                ", Фамилия имя отчество :" + surName +" " +
                 name+ " " +lastName +
                ", дата рождения: " + birthday;
    }
}
