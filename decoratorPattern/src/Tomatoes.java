public class Tomatoes extends BaseDecorator{

    Bakery bakery;

    public Tomatoes(Bakery bakery){
        this.bakery = bakery;
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
