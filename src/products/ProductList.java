package products;


import java.util.HashSet;
        import java.util.Objects;
        import java.util.Set;

public class ProductList {

    private final String name;
    private  Set<Product> products = new HashSet<>();

    public ProductList(String name) {
        this.name = name;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Продукт " + product.getName()+" уже куплен!" );
        }
        products.add(product);
    }
    public void remove(Product product) {
                   if (!products.remove(product)) {
                       throw new IllegalArgumentException("Такого продукта нет! ");
            }
    }
    public String getName() {
        return name;
    }
    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductList market = (ProductList) o;
        return Objects.equals(name, market.name) && Objects.equals(products,
                market.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }

    @Override
    public String toString() {
        return "В магазине " + "\"" + name + "\"" +
                " были куплены следующие продукты:\n" + products;
    }
}