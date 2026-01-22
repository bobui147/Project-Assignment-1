
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class Problem3{

    public static void checkPairSum(int[] arr, int goalSum) {
        Set<Integer> seen = new HashSet<>();
        List<String> pairs = new ArrayList<>();

        for (int x : arr) {
            int needed = goalSum - x;

            if (seen.contains(needed)) {
                pairs.add("(" + needed + "," + x + ")");
            }
            seen.add(x);
        }

        if (!pairs.isEmpty()) {
            System.out.print("true \u2192 ");
            for (int i = 0; i < pairs.size(); i++) {
                System.out.print(pairs.get(i));
                if (i < pairs.size() - 1) {
                    System.out.print(" or ");
                }
            }
            System.out.println();
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int[] X = {-5, 1, -40, 20, 6, 8, 7};
        int goalSum = 15;
        checkPairSum(X, goalSum);
    }
}
