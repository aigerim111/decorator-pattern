public class Vegetables extends BaseDecorator{
    public Vegetables(Bakery bakery) {
        super(bakery);
    }

    @Override
    public Integer cost() {
        return bakery.cost() + 400;
    }

    @Override
    public String ingredients() {
        return bakery.ingredients() + " with vegetables";
    }
}
