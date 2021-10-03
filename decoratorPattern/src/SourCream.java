public class SourCream extends BaseDecorator{
    public SourCream(Bakery bakery) {
        super(bakery);
    }

    @Override
    public Integer cost() {
        return bakery.cost() + 150;
    }

    @Override
    public String ingredients() {
        return bakery.ingredients() + " with sour cream";
    }
}
