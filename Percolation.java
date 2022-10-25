public class Percolation {
    private int rowLength;
    private int[] grid;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        rowLength = n;
        int cubeNumber = n * n;
        grid = new int[cubeNumber + 2];
        for (int i = 0; i < grid.length; i++) {
            if (i <= n + 1) {
                grid[i] = 0;
            } else if (grid.length - i <= n) {
                grid[i] = grid.length - 1;
            } else {
                grid[i] = i;
            }
        }
    }

    // test client (optional)
    public static void main(String[] args) {
        Percolation percolation = new Percolation(10);
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return false;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return false;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }
}