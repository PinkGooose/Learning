package lesson13;

import java.util.HashMap;
import java.util.Objects;

public class Recipe {

    private String name;
    private int timeToCook;
    private String description;
    private HashMap<String, Integer> ingredients = new HashMap<>();

    public Recipe() {
    }

    public Recipe(String name, int timeToCook, String description) {
        this.name = name;
        this.timeToCook = timeToCook;
        this.description = description;
    }

    public void addIngredient(String product, int value) {
        ingredients.put(product, value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeToCook() {
        return timeToCook;
    }

    public void setTimeToCook(int timeToCook) {
        this.timeToCook = timeToCook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public void printInfo() {
        System.out.println("Название: " + getName());
        System.out.println("Время приготовления: " + getTimeToCook());
        System.out.println("Краткое описание: " + getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipe recipe = (Recipe) o;
        return timeToCook == recipe.timeToCook && Objects.equals(name, recipe.name) && Objects.equals(description, recipe.description) && Objects.equals(ingredients, recipe.ingredients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + timeToCook;
        result = 31 * result + Objects.hashCode(description);
        result = 31 * result + Objects.hashCode(ingredients);
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", timeToCook=" + timeToCook +
                ", description='" + description + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
