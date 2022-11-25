package Singleton;

public class main {
    public static void main(String[] args) {

        Singleton arr[] = new Singleton[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.count);
    }
}
