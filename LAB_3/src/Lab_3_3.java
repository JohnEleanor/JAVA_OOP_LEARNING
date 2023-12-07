public class Lab_3_3 {
    public static void main(String[] args) {
        int a = 10, b = 6;
        double y;
        System.out.println("When a = " + a + ", b = " + b + '\n');
        // สมกํารที 1

        y = (a - b) * (a + b);
        System.out.println("y = (a - b) * (a + b) = " + y);
        // สมกํารที 2

        y = 3 * ((a - b) * (a + b)) - 6;
        System.out.println("y = 3 * ((a - b) * (a + b)) - 6 = " + y);
        // สมกํารที 3

        y = 1 - (2 * a) / (3 * b);
        System.out.println("y = 1 - (2 * a) / (3 * b) = " + y);
    }
}
