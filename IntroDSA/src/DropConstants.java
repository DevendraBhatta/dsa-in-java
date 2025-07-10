public class DropConstants {
    public static void main(String[] args) {
        printItems(10);
    }

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
    // 1 --> Drop Constants
    // O(n+n) = O(2n)
    // O(2n) = O(n)
}
