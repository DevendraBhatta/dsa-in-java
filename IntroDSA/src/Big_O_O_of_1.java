public class Big_O_O_of_1 {
    public static void main(String[] args) {
        System.out.println("Number of all Items are: "+addItems(20));
    }

    public static int addItems(int n){
        return n+n;
    }

    // As n grow number of operation doesn't grow
    // Big O ==> O of 1
    // O(1)

}
