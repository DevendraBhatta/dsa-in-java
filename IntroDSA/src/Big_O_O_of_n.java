public class Big_O_O_of_n {
    public static void main(String[] args) {
        printItems(10);
    }

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // Big O(n)
    // O(n) = 10
}
