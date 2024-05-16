public class Multiples {
    // prints how many multiples of 3 or 5 there are below 1000
    // Tip: Just like with psvm, you can start typing sout and then press Enter to generate System.out.println(); in IntelliJ.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
