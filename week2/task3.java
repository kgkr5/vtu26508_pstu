import java.util.*;
import java.util.stream.*;

public class task3 {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = arr.stream().mapToLong(Integer::longValue).sum();
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            arr.add(sc.nextInt());
        }
        sc.close();
        if (!arr.isEmpty()) {
            miniMaxSum(arr);
        }
    }
}