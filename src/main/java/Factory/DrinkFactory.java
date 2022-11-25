package Factory;

import java.util.Random;

public class DrinkFactory {

    public static Drink createDrink(int age){


        if (age < 9) {
            return new Milk();
        }else if (age > 8 && age <18){
            return new Juice();
        }else {
            Random random = new Random();

            return new Beer(random.nextInt(15 - 4 + 1) + 4);
        }

    }
}
