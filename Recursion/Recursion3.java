// tower of Hanoi
public class Recursion3 {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Step 1
        towerOfHanoi(n - 1, src, dest, helper);

        // Step 2
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Step 3
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {

        int n = 3;
        towerOfHanoi(n, "S", "H", "D");

    }
}