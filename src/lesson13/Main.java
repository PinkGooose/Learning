package lesson13;

public class Main {
    public static void main(String[] args) {

        Fridge fridge = new Fridge();
        //Метод - добавить продукт в холодильник
        fridge.addProduct("Яблоко", 300);
        fridge.addProduct("Молоко", 1000);
        fridge.addProduct("Яблоко", 200);
        fridge.addProduct("Яйцо", 40);

        // метод - печатает на консоль содержание холодильника
        /*fridge.printAllProducts();
        fridge.printAllProducts2();*/
        //fridge.printAllProduct3();

        // взять что-то из холодильника
        //fridge.getProduct("Яйцо", 2);
        //fridge.printAllProduct3();

        // создаем рецепт яблочного пирога
        Recipe cake = new Recipe("Шарлотка", 50, "Легкий летний вариант вкусного пирога");
        cake.addIngredient("Яблоко", 200);
        cake.addIngredient("Молоко", 500);
        cake.addIngredient("Яйцо", 8); // яиц не хватает
        cake.addIngredient("Мука", 600); // муки совсем нет

        /*fridge.canCook(cake);
        System.out.println("Продукт, которого меньше всего:");
        fridge.minimumProduct();
        System.out.println("Веса всех продуктов в холодильнике:");
        fridge.weightOfProducts();*/

        Recipe olivie = new Recipe("Оливье", 15, "Традиционный салат русской кухни");
        olivie.addIngredient("Картофель", 2);
        olivie.addIngredient("Яйцо", 2);
        olivie.addIngredient("Курица", 1);
        olivie.addIngredient("Огурец", 2);
        olivie.addIngredient("Зеленый горошек", 100);
        olivie.addIngredient("Майонез", 50);
        System.out.println("Приготовление салата:");
        fridge.canCook(olivie);
        System.out.println();

        System.out.println("Вся информация о рецепте: ");
        cake.printInfo();
        System.out.println();
        System.out.println("Вся информация о рецепте: ");
        olivie.printInfo();

    }
}
