package transport;

import java.util.Objects;

public class Sponsor {
    private final String name;
private final  int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount=amount;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return amount == sponsor.amount && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount);
    }

    public int getAmount() {
        return amount;
    }
    public  void toSponsorRase(){
        System.out.printf("Спонсор %s поддержал заезд на  %d%n", getName(), getAmount());
    }

    @Override
    public String toString() {
        return  name + ", сумма поддержки: " + amount+" руб.";
    }
}
