public class XsAndYs {
    public static void main(String[] args) {
        System.out.println("x   y");
        System.out.println("-------------");
        for (double i = -10; i <= 10; i += 0.5) {
            System.out.println(i + "  " + (i * i));
            System.out.println();
        }
    }
}
