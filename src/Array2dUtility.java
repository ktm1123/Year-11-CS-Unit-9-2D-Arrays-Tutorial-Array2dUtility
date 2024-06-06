
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] a){
        for (int[] row: a){
            for (int x: row){
                System.out.println(x);
            }
        }

    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] a){
        int total = 0;
        for (int[] row: a){
            for (int x: row){
                total+=x;
            }
        }
        return total;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] a){
        int sum = sum(a);
        return sum / Math.pow(a.length, 2);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] a){
        int min = a[0][0];
        for (int[] row: a){
            for (int x: row){
                if (x<min) min = x;
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] a){
        int max = a[0][0];
        for (int[] row: a){
            for (int x: row){
                if (x>max) max = x;
            }
        }
        return max;
    }


    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] a){
        int n = 0;
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                if (a[i][j]%2==0) n++;
            }
        }
        return n;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] a){
        int n = 0;
        for (int[] row: a){
            for (int x: row){
                if (x%2==0) n++;
            }
        }
        return n;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] a) {
        boolean allp = true;
        for (int[] row: a){
            for (int x: row){
                if (x<0){
                    allp=false;
                    break;
                }
            }
        }
        return allp;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] a){
        int[] row_sums = new int[a.length];
        for (int i=0; i<a.length; i++){
            int row_sum = 0;
            for (int j=0; j<a[i].length; j++){
                row_sum += a[i][j];
            }
            row_sums[i] = row_sum;
        }
        return row_sums;
    }


    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] a){
        int[] col_sums = new int[a.length];
        for (int i=0; i<a[0].length; i++){
            int col_sum = 0;
            for (int j=0; j<a.length; j++){
                col_sums[i]+=a[j][i];
            }
        }
        return col_sums;
    }

}