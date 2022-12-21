package products;
import java.util.Objects;
public class Product {
    private String name;
    private Double price;
    private Double amount;

    protected Product(String name, Double price, Double amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new EmptyFieldsException("Заполните карточку товара полностью ");
        }
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public Double setPrice(Double price) {
        if (price <= 0) {
            throw new EmptyFieldsException("Заполните карточку товара " + getName() + " полностью: ");
        } else {
            this.price = price;
        }
        return price;
    }


        @Override
        public String toString () {
            return getName() + ", цена: " + getPrice() + " рублей, " + getAmount() + " кг.\n";
        }

        @Override
        public boolean equals (Object o){
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Product product = (Product) o;
            return Objects.equals(name, product.name);
        }

        @Override
        public int hashCode () {
            return Objects.hash(name);
        }


    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        if (amount <= 0) {
            throw new EmptyFieldsException("Заполните карточку товара " + getName() + " полностью: ");
        } else {
            this.amount = amount;
        }
    }
}
