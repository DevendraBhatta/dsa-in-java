public class DropNonDominance {
    public static void main(String[] args) {
        printItems(10);
    }

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }


    // Drop Non Dominance
    // O(n^2+n) example--> { as n grow n^2 grow significantly 10000+100 }
    // as n^2 is dominant we have to ignore n
    // Big O becomes O(n^2)
}
