public abstract class BakeryImplementation implements Bakery {
    String ingredient;

    @Override
    public String ingredients() {
        return ingredient;
    }

    @Override
    public abstract Integer cost();
}
