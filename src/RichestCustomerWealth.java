/**
 * RichestCustomerWealth
 */
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int current;
        for (int i = 0; i < accounts.length ;i++ ) {
            current = 0;
            for (int j = 0;j < accounts[i].length;j++) {
                current += accounts[i][j];
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}