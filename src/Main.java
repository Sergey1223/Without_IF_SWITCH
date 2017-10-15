import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + util.getUnevenElementsCount(arr));
        System.out.println(util.getTypeDay("16.10.2017"));
        util.multiType(new Integer(5));
        util.multiType("Util");

    }
}
