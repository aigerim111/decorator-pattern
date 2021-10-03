public class Vegetables extends BaseDecorator{
    Bakery bakery;

    public Vegetables(Bakery bakery){
        this.bakery = bakery;
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
