public class CompareToChallenge {
    public static void main (String[] args) {
        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"applebees's\" with \"apple\" produces ");
        System.out.println("applebees's".compareTo("apple"));

        System.out.print("Comparing \"dog\" with \"dog\" produces ");
        int x = "dog".compareTo("dog");
        System.out.println(x);
    }
}
