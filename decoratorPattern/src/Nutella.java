public class Nutella extends BaseDecorator{
    Bakery bakery;

    public Nutella(Bakery bakery){
        this.bakery = bakery;
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
