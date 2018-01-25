package Chapter8;
/**
 * Program to sort out employee hours
 *
 * @author Ibrahim Matar
 */
public class C8_4 {
    static final int employee = 0;
    static final int numbhours = 1;
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int[][] employeehours = new int[][]{
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};

        int[][] totalhours = calculatedhours(employeehours);

        sorter(totalhours);

        for (int i = 0; i < totalhours.length; i++) {

            System.out.println("Employee " + totalhours[i][employee] + " total hours in past week : "
                    + totalhours[i][numbhours]);
        }

    }
    /**
     * calculatedhours Method
     * 
     * @param z the z row of the array
     * @return totalHoursChart
     */
    public static int[][] calculatedhours(int[][] z) {

        int[][] totalHoursChart = new int[z.length][2];

        for (int x = 0; x < z.length; x++) {
            totalHoursChart[x][numbhours] = rowhourtotal(z, x);
            totalHoursChart[x][employee] = x;
        }

        return totalHoursChart;
    }
    /**
     * rowhourtotal Method
     * 
     * @param m is the row length
     * @param row the rows of the array
     * @return total
     */
    public static int rowhourtotal(int[][] m, int row) {

        int total = 0;
        for (int column = 0; column < m[row].length; column++) {
            total += m[row][column];
        }
        return total;
    }
    /**
     * sorter Method
     * 
     * @param m helps sort everything out
     */
    public static void sorter(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {

            int currentIndex = i;
            int max = m[i][numbhours];
            int employeenumber = m[i][employee];
            for (int k = i + 1; k < m.length; k++) {

                if (max < m[k][numbhours]) {
                    max = m[k][numbhours];
                    currentIndex = k;
                    employeenumber = m[k][employee];
                }
            }

            if (currentIndex != i) {
                m[currentIndex][employee] = m[i][employee];
                m[currentIndex][numbhours] = m[i][numbhours];
                m[i][employee] = employeenumber;
                m[i][numbhours] = max;
            }

        }
    }
}

