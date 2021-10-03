public class Pancakes extends BakeryImplementation{
    public Pancakes(){
        ingredient = "Pancakes";
    }

    @Override
    public Integer cost() {
        return 500;
    }
}
