public class Main {
    public static void main(String[] args) {
        Bakery choice = new Tofu(new SourCream(new Vegetables(new Sandwich())));

        System.out.println(choice.cost());
        System.out.println(choice.ingredients());



        Bakery choice1 = new Nutella(new Berries(new Pancakes()));

        System.out.println(choice1.cost());
        System.out.println(choice1.ingredients());


        Bakery choice2 = new Chicken(new Tomatoes(new Сroissant()));

        System.out.println(choice2.cost());
        System.out.println(choice2.ingredients());
    }
}
