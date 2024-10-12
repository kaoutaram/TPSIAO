import java.util.ArrayList;

public class MatriceYoung {
    public static final int INF = Integer.MAX_VALUE; // Representation of infinity
    private int n; // Number of rows
    private int m; // Number of columns
    private ArrayList<ArrayList<Integer>> tableau; // Internal structure to store elements
    private int count = 0; // Counter for the number of inserted elements

    // Constructor to initialize the Young tableau
    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        tableau = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> ligne = new ArrayList<>(m);
            for (int j = 0; j < m; j++) {
                ligne.add(INF); // Initialize with infinite values
            }
            tableau.add(ligne);
        }
    }

    // Method to extract the minimum from the tableau
    public int extraireMin() {
        if (count == 0) {
            return INF; // If the tableau is empty
        }
        int min = tableau.get(0).get(0);
        tableau.get(0).set(0, tableau.get(n - 1).get(m - 1)); // Replace with the last element
        tableau.get(n - 1).set(m - 1, INF); // Set the last element to INF
        count--; // Decrement the counter
        equilibrerTableau(0, 0); // Rebalance the tableau
        return min; // Return the minimum value
    }

    // Method to add an element to the tableau
    public boolean add(int valeur) {
        if (count >= n * m) {
            System.out.println("Le tableau de Young est plein.");
            return false; // Check if the tableau is full
        }

        // Add the value to the first empty position
        int i = count / m;
        int j = count % m;
        tableau.get(i).set(j, valeur); // Add the value
        count++; // Increment the counter
        remonterTableau(i, j); // Move the added value up
        return true;
    }

    // Method to restore the Young tableau property after extracting the minimum
    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? tableau.get(i + 1).get(j) : INF;
        int right = (j + 1 < m) ? tableau.get(i).get(j + 1) : INF;

        // If both down and right elements are INF, nothing to balance
        if (down == INF && right == INF) {
            return;
        }

        if (down < right) {
            tableau.get(i).set(j, down);
            tableau.get(i + 1).set(j, INF); // Set the moved element to INF
            equilibrerTableau(i + 1, j);
        } else {
            tableau.get(i).set(j, right);
            tableau.get(i).set(j + 1, INF); // Set the moved element to INF
            equilibrerTableau(i, j + 1);
        }
    }

    // Method to move up the added value
    private void remonterTableau(int i, int j) {
        // As long as the added element is smaller than its parent
        while (i > 0 || j > 0) {
            int parentI = (i > 0) ? i - 1 : i;
            int parentJ = (j > 0) ? j - 1 : j;
            int parentValue = tableau.get(parentI).get(parentJ);

            // If the current element is smaller than its parent, swap them
            if (tableau.get(i).get(j) < parentValue) {
                tableau.get(parentI).set(parentJ, tableau.get(i).get(j));
                tableau.get(i).set(j, parentValue);
                i = parentI;
                j = parentJ;
            } else {
                break; // The element is in the right position
            }
        }
    }

    // Method to print the tableau
    public void printTableau() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tableau.get(i).get(j) == INF) {
                    System.out.print("INF" + "; ");
                } else {
                    System.out.print(tableau.get(i).get(j) + "; ");
                }
            }
            System.out.println();
        }
    }}