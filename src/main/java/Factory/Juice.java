package Factory;

public class Juice implements Drink{

    private final String name = "Juice";

    @Override
    public void getDrink() {
        System.out.println(name);
    }
}
