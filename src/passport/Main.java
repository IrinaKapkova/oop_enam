package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("6405 525780", "Сидорик", "Петр", "Павлович",
                LocalDate.now().minusYears(45)));
        passports.add(new Passport("6405 525780", "Сидорик", "Иван", "Павлович",
                LocalDate.now().minusYears(40)));
        passports.add(new Passport("5500 525780", "Маулин", "Светогор", "Емельянович",
                LocalDate.now().minusYears(29)));
        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
        passportList.add(new Passport("6405 525780", "Сидорик", "Иван", "Павлович",
                LocalDate.now().minusYears(40)));
        System.out.println(passportList);
    }
}

