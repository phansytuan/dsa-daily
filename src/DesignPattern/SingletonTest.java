package DesignPattern;

class SingletonTest_Singleton {

    private static SingletonTest_Singleton single_instance = null;
    public String s;

    private SingletonTest_Singleton() {
        s = "String from Singleton class";
    }

    // Method
    public static SingletonTest_Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new SingletonTest_Singleton();
        }
        return single_instance;
    }
}

public class SingletonTest {
    public static void main(String[] args) {

        SingletonTest_Singleton x = SingletonTest_Singleton.getInstance();
        SingletonTest_Singleton y = SingletonTest_Singleton.getInstance();

        // Thay đổi giá trị thông qua x
        x.s = x.s.toUpperCase();
        System.out.println("From x: " + x.s + " | From y: " + y.s);

        // Thay đổi giá trị thông qua y
        y.s = y.s.toLowerCase();
        System.out.println("From x: " + x.s + " | From y: " + y.s);
    }
}
