public class Berries extends BaseDecorator{

    Bakery bakery;

    public Berries(Bakery bakery){
        this.bakery = bakery;
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
