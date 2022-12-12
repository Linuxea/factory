package simple;

public class SimpleFactoryClient {

    public static void main(String[] args) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.getCoffee("香蕉牛奶咖啡");
        coffee.drink();

        // one more coffee
        coffee = simpleCoffeeFactory.getCoffee("牛奶咖啡");
        coffee.drink();


        // one more coffee again
        coffee = simpleCoffeeFactory.getCoffee("爪哇咖啡");
        coffee.drink();
    }

}
