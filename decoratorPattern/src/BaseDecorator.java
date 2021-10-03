public abstract class BaseDecorator implements Bakery {
    Bakery bakery;

    public BaseDecorator(Bakery bakery){
        this.bakery = bakery;
    }

    public abstract String ingredients();

    public abstract Integer cost();
}
