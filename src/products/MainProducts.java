package products;

public class MainProducts {

    public static void main(String[] args) {
        Product banana = new Product("Банан", 69.0, 3.5);
        Product tomato = new Product("Томат", 100.0, 1.0);
        Product potato = new Product("Картофель", 20.0, 15.2);
        Product pepper = new Product("Перец", 270.0, 0.5);
        Product cabbage = new Product("Капуста", 85.0, 3.0);
        Product onion  = new Product("Лук", 28.0, 1.0);
        Product cucumber = new Product("Огурец", 95.0, 1.7);
        Product carrot = new Product("Морковь", 41.0, 7.7);

        ProductList purchases = new ProductList("Продукты 24");
        purchases.addProduct(banana);
        purchases.addProduct(tomato);
        purchases.addProduct(potato);
        purchases.addProduct(pepper);
        purchases.addProduct(cabbage);
        purchases.addProduct(onion);
        System.out.println(purchases);

        Recipe olivierSalad = new Recipe("Салат Оливье");
        olivierSalad.addProductInRecipe(potato, 3);
        olivierSalad.addProductInRecipe(onion, 4);
        olivierSalad.addProductInRecipe(cucumber, 4);
        olivierSalad.addProductInRecipe(carrot, 2);


        Recipe springSalad = new Recipe("Весенний салат");
        springSalad.addProductInRecipe(potato, 3);
        springSalad.addProductInRecipe(onion, 3);
        springSalad.addProductInRecipe(cucumber, 2);

        Recipe mexicanSalad = new Recipe("Мексиканский салат");
        mexicanSalad.addProductInRecipe(potato, 4);
        mexicanSalad.addProductInRecipe(onion, 2);
        mexicanSalad.addProductInRecipe(pepper, 1);

        ListOfRecipes listOfRecipes = new ListOfRecipes("Рецепты");
        listOfRecipes.addRecipeInList(olivierSalad);
        listOfRecipes.addRecipeInList(springSalad);
        listOfRecipes.addRecipeInList(mexicanSalad);
//        listOfRecipes.addRecipeInList(mexicanSalad);
        listOfRecipes.toStringListOfRecipes();

        System.out.println(
                "Общая стоимость продуктов по рецепту " + olivierSalad.getNameRecipe() +
                        " составила: " + olivierSalad.getCostOfProducts() + " рублей");
        System.out.println(
                "Общая стоимость продуктов по рецепту " + springSalad.getNameRecipe() +
                        " составила: " + springSalad.getCostOfProducts() + " рублей");
        System.out.println(
                "Общая стоимость продуктов по рецепту  "+ mexicanSalad.getNameRecipe() +
                        "составила: "+ mexicanSalad.getCostOfProducts() + " рублей");
        System.out.println();
        purchases.remove(banana);
    }
}