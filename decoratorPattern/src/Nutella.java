public class Nutella extends BaseDecorator{

    public Nutella(Bakery bakery) {
        super(bakery);
    }

    @Override
    public Integer cost() {
        return bakery.cost() + 200;
    }

    @Override
    public String ingredients() {
        return bakery.ingredients() + " with nutella";
    }
}
