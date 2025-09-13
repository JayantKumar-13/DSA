import java.util.*;

public class StampPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of operations
            int m = sc.nextInt(); // Side length of the square stamp

            // Use a set to track all stamped cells
            Set<String> stampedCells = new HashSet<>();

            // Directions for checking neighbors (right, left, up, down)
            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0, 1, -1};

            // Starting position of the stamp (bottom-left corner)
            int x = 0, y = 0;

            for (int i = 0; i < n; i++) {
                int xi = sc.nextInt();
                int yi = sc.nextInt();

                // Move the stamp
                x += xi;
                y += yi;

                // Mark all cells covered by the m x m stamp
                for (int a = 0; a < m; a++) {
                    for (int b = 0; b < m; b++) {
                        stampedCells.add((x + a) + "," + (y + b));
                    }
                }
            }

            // Calculate the perimeter of the connected region
            int perimeter = 0;
            for (String cell : stampedCells) {
                String[] parts = cell.split(",");
                int cx = Integer.parseInt(parts[0]);
                int cy = Integer.parseInt(parts[1]);

                // Check all four neighbors
                for (int d = 0; d < 4; d++) {
                    int nx = cx + dx[d];
                    int ny = cy + dy[d];
                    if (!stampedCells.contains(nx + "," + ny)) {
                        perimeter++;
                    }
                }
            }

            result.append(perimeter).append("\n");
        }

        System.out.print(result);
        sc.close();
    }
}
