import java.util.*;

public class PrintAnysubsequence {

    boolean print(int ind, ArrayList<Integer> ds, int s, int sum, int arr[], int n) {
        if (ind == n) {
            if (s == sum) {
                for (int val : ds) {
                    System.out.print(val + " ");
                }
                System.out.println();
                return true;  
            }
            return false;
        }

        ds.add(arr[ind]);
        s += arr[ind];
        if (print(ind + 1, ds, s, sum, arr, n)) {
            return true;
        }

        s -= arr[ind];
        ds.remove(ds.size() - 1);
        if (print(ind + 1, ds, s, sum, arr, n)) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        PrintAnysubsequence p1 = new PrintAnysubsequence();
        int arr[] = {1, 2, 1};
        int n = arr.length;
        int sum = 2;

        ArrayList<Integer> ds = new ArrayList<>();
        p1.print(0, ds, 0, sum, arr, n);
    }
}

