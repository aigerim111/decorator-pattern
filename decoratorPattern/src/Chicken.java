public class Chicken extends BaseDecorator{
    public Chicken(Bakery bakery) {
        super(bakery);
    }

    @Override
    public Integer cost() {
        return bakery.cost() + 550;
    }

    @Override
    public String ingredients() {
        return bakery.ingredients() + " with chicken";
    }
}
