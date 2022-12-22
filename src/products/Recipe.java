package products;
import java.util.HashMap;
import java.util.Objects;

public class Recipe {

    private final HashMap<Product, Integer> products = new HashMap<>();
    private Double costOfProducts = 0.0;
    private final String nameRecipe;

    public Recipe(String nameRecipe) {
        this.nameRecipe = (nameRecipe != null && !nameRecipe.trim().isEmpty()) ? nameRecipe
                : " Введите название рецепта! ";
    }

    public void addProductInRecipe(Product product, Integer value) {
        if (products.containsKey(product)) {
            throw new RuntimeException("Продукт "+ product.getName()+" уже есть в списке рецепта " +nameRecipe);
        } else if (value != null && value < 1) {
            this.products.put(product,1);
        } else {
            products.put(product, value);
        }
    }

    public void setCostOfProducts(Double costOfProducts) {
        this.costOfProducts = costOfProducts;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Double getCostOfProducts() {
        for (Product product : products.keySet()) {
            costOfProducts += product.getPrice() * products.get(product);
        }
        return costOfProducts;
    }

    @Override
    public String toString() {
        return String.format("\nНазвание рецепта:\"%s\", необходимые продукты:%s\n", nameRecipe,
                getProducts());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return nameRecipe.equals(recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }
}