public class Tomatoes extends BaseDecorator{
    public Tomatoes(Bakery bakery) {
        super(bakery);
    }

    @Override
    public Integer cost() {
        return bakery.cost() + 350;
    }

    @Override
    public String ingredients() {
        return bakery.ingredients() + " with tomatoes";
    }
}
