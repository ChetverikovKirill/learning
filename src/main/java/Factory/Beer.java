package Factory;

public class Beer implements Drink {

    private final String name = "Beer";
    private int strength;

    public Beer(int strength) {
        this.strength = strength;
    }

    @Override
    public void getDrink() {
        System.out.println(name + " strength " + strength + "%");
    }
}
