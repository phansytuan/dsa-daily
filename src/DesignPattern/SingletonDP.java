package DesignPattern;

class SingletonDP_Singleton {

    // Biến static giữ duy nhất 1 instance
    private static SingletonDP_Singleton single_instance = null;

    // Biến dữ liệu trong Singleton
    public String s;

    // Constructor private để Ngăn tạo instance bên ngoài
    private SingletonDP_Singleton() {
        s = "--> Hello, I am a Singleton instance";
    }

    // Phương thức static trả về instance duy nhất
    public static synchronized SingletonDP_Singleton getInstance() {

        if (single_instance == null) {
            single_instance = new SingletonDP_Singleton();
        }
        return single_instance;
    }
}

public class SingletonDP {
    public static void main(String[] args) {

        // Lấy cùng 1 instance của Singleton
        SingletonDP_Singleton x = SingletonDP_Singleton.getInstance();
        SingletonDP_Singleton y = SingletonDP_Singleton.getInstance();
        SingletonDP_Singleton z = SingletonDP_Singleton.getInstance();

        // In hashcode để chứng minh chúng cùng 1 đối tượng
        System.out.println("Hashcode of x: " + x.hashCode());
        System.out.println("Hashcode of y: " + y.hashCode());
        System.out.println("Hashcode of z: " + z.hashCode());

        if (x == y && y == z)
            System.out.println("All variables point to the same Singleton instance.");

        System.out.println(x.s);
    }
}
