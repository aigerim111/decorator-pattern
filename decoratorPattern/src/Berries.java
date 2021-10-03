public class Berries extends BaseDecorator{
    public Berries(Bakery bakery) {
        super(bakery);
    }

    @Override
    public Integer cost() {
        return bakery.cost() + 450;
    }

    @Override
    public String ingredients() {
        return bakery.ingredients() + " with berries";
    }
}
