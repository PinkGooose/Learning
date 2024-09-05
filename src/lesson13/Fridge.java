package lesson13;

import java.util.HashMap;
import java.util.Map;

public class Fridge {

    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int value) {
        // Есть ли уже этот продукт в холодильнике
        if(products.containsKey(product)) {
            products.put(product, products.get(product) + value);
        } else {
            products.put(product, value);
        }
    }

    public void printAllProducts() {
        System.out.println(products);
    }

    public void printAllProducts2() {
        for(String pr : products.keySet()) {
            System.out.println(pr + " - " + products.get(pr));
        }
    }

    public void printAllProduct3() {
        for(Map.Entry<String, Integer> pr : products.entrySet()) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }
    }

    public void getProduct(String product, int value) {
        if(!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет!!! - " + product);
            return;
        }

        if(products.get(product) < value) {
            System.out.println("Такого продукта не достаточно!!!  -  " + product);
            return;
        }

        products.put(product, products.get(product) - value);
    }

    public void canCook(Recipe cake) {
        // 2 HashMap (все продукты и ингридиенты)
        int countNotEnough = 0;
        for(String ingr: cake.getIngredients().keySet()) {
            if(!products.containsKey(ingr)) {//Проверяемместь ли ингридиент в холодильнике
                countNotEnough++;
                System.out.println("У нас вообще нет: " + ingr + ", а нужно " + cake.getIngredients().get(ingr));
            } else {//проверяем чтобы его было достаточно
                if(products.get(ingr) < cake.getIngredients().get(ingr)) {
                    countNotEnough++;
                    System.out.println("Недостатчно: " + ingr + ", не хватает еще " + (cake.getIngredients().get(ingr) - products.get(ingr)));
                }
            }
        }

        if(countNotEnough == 0) {
            System.out.println("Ура! Мы можем приготовить это блюдо: " + cake.getName());
        }
    }

    public void minimumProduct() {
        String min = "";
        int minimum = 0;
        for(String product:products.keySet()) {
            if(minimum > products.get(product)) {
                minimum = products.get(product);
                min = product;
            }
        }
        System.out.println("В холодильнике меньше всего - " + min + ", его всего лишь: " + minimum);
    }

    public void weightOfProducts() {
        for(String pr:products.keySet()) {
            System.out.println("Продукт - " + pr + " содержится в количестве: " + products.get(pr));
        }
    }
}
