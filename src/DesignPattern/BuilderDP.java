package DesignPattern;

// Lớp Student bất biến
final class ImmutableStudent {

    private final int id;
    private final String name;
    private final String address;

    private ImmutableStudent(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

    // Inner Static Builder class
    public static class Builder {

        private int id;
        private String name;
        private String address;

        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        // Trả về đối tượng ImmutableStudent bất biến
        public ImmutableStudent build() {
            return new ImmutableStudent(this);
        }
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", address = " + address;
    }
}

// Client sử dụng
public class BuilderDP {
    public static void main(String[] args) {

        ImmutableStudent student1 = ImmutableStudent.Builder.newInstance()
                .setId(1)
                .setName("Ram")
                .setAddress("Noida")
                .build();

        ImmutableStudent student2 = ImmutableStudent.Builder.newInstance()
                .setId(2)
                .setName("Shyam")
                .setAddress("Delhi")
                .build();

        System.out.println(student1);
        System.out.println(student2);
    }
}
