public class HelloWorld {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Hello world!" + " " + i);
        }
        hazelnut();
    }
    public static void hazelnut() {
        System.out.println("Tree");
        System.out.println("Grass");
    }
}