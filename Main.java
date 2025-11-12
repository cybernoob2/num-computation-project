import java.util.*;

class Main {
    // Declare shared variables
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> y = new ArrayList<>();
    int h, x, x0;

    //Capture user input
    public void captures() {
        System.out.println("Enter value of h:");
        h = scanner.nextInt();

        System.out.println("Enter value of x:");
        x = scanner.nextInt();

        System.out.println("Enter value of x0:");
        x0 = scanner.nextInt();

        System.out.println("How many values of y do you have:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of y" + i + ": ");
            int value = scanner.nextInt();
            y.add(value);
        }
    }

    //Compute differences
    public void compute() {
        List<List<Integer>> differences = new ArrayList<>();
        List<Integer> current = y;

        while (current.size() > 1) {
            List<Integer> diff = new ArrayList<>();
            for (int i = 0; i < current.size() - 1; i++) {
                diff.add(current.get(i + 1) - current.get(i));
            }
            differences.add(diff);
            current = diff;
        }

        // Display all differences
        for (int i = 0; i < differences.size(); i++) {
            System.out.println("d" + (i + 1) + "y = " + differences.get(i));
        }
    }

    //Main method
    public static void main(String[] args) {
        System.out.println("Newton Forward Interpolation Formula");

        Main obj = new Main(); // Create an object to access non-static methods
        obj.captures();
        obj.compute();
    }
}
