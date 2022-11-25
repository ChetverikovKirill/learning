package Singleton;

public class Singleton {
    private static Singleton instance;
    public static int count = 0;

    public static int getCount() {
        return count;
    }

    private Singleton() {
        count++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
