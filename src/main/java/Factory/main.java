package Factory;

public class main {

    public static void main(String[] args) {

        DrinkFactory.createDrink(18).getDrink();

        DrinkFactory.createDrink(16).getDrink();

        DrinkFactory.createDrink(5).getDrink();
    }
}
