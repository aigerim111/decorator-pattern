public class Sandwich extends BakeryImplementation{

    public Sandwich() {
        ingredient = "Sandwich";
    }

    @Override
    public Integer cost() {
        return 300;
    }
}
