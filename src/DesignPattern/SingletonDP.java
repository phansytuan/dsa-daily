package DesignPattern;


class Singleton {

    // Biến static giữ duy nhất 1 instance
    private static Singleton single_instance = null;

    // Biến dữ liệu trong Singleton
    public String s;

    // Constructor private để Ngăn tạo instance bên ngoài
    private Singleton() { s = "--> Hello, I am a Singleton instance"; }
    

    // Phương thức static trả về instance duy nhất
    public static synchronized Singleton getInstance() {

        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

public class SingletonDP {
    public static void main(String[] args) {

        // Lấy cùng 1 instance của Singleton
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        // In hashcode để chứng minh chúng cùng 1 đối tượng
        System.out.println("Hashcode of x: " + x.hashCode());
        System.out.println("Hashcode of y: " + y.hashCode());
        System.out.println("Hashcode of z: " + z.hashCode());

        if (x == y && y == z)  System.out.println("All variables point to the same Singleton instance.");

        System.out.println(x.s);
    }
}
