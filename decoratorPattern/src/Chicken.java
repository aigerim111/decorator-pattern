public class Chicken extends BaseDecorator{

    Bakery bakery;

    public Chicken(Bakery bakery){
        this.bakery = bakery;
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
