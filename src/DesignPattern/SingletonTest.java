package DesignPattern;

class Singleton {

    private static Singleton single_instance = null;
    public String s;

    private Singleton() {
        s = "String from Singleton class";
    }

    // Method
    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

public class SingletonTest {
    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        // Thay đổi giá trị thông qua x
        x.s = x.s.toUpperCase();
        System.out.println("From x: " + x.s + " | From y: " + y.s);

        // Thay đổi giá trị thông qua y
        y.s = y.s.toLowerCase();
        System.out.println("From x: " + x.s + " | From y: " + y.s);
    }
}
