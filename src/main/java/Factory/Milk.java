package Factory;

public class Milk implements Drink{

    private final String name = "Milk";

    @Override
    public void getDrink() {
        System.out.println(name);
    }
}
