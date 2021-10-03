public class SourCream extends BaseDecorator{
    Bakery bakery;

    public SourCream(Bakery bakery){
        this.bakery = bakery;
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
