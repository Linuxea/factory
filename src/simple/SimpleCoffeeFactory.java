package simple;

/**
 * 简单牛奶工厂
 */
public class SimpleCoffeeFactory {

    /**
     * 负责获取实际咖啡的创建逻辑
     * 同时需要负责之后的咖啡各类增长的逻辑维护（违背开闭原则）
     * @param coffeeName 咖啡名称
     * @return {@link Coffee}
     */
    public Coffee getCoffee(String coffeeName){
        Coffee coffee;
        switch (coffeeName) {
            case "香蕉牛奶咖啡":
                coffee = new BannaCoffee();break;
            case "牛奶咖啡":
                coffee = new MilkCoffee();break;
            default: throw new UnsupportedOperationException("没有这种牛奶目前， 敬请等待上线");
        }

        return coffee;
    }

}
