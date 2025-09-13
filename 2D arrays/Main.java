import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int[] row : arr) {
                Arrays.sort(row);
            }

            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = i + 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i][0] > arr[j][0]) {
                        swapRows(arr, i, j);
                        swap(p, i, j);
                    }
                }
            }

            boolean valid = true;
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    if (arr[i][j] != j * n + i) {
                        System.out.println("-1");
                        valid = false;
                        break;
                    }
                }
                if (!valid) break;
            }

            if (valid) {
                for (int i = 0; i < n; i++) {
                    System.out.println(p[i]);
                }
            }
        }
        sc.close();
    }

    public static void swapRows(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
