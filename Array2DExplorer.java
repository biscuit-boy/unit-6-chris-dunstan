public class Array2DExplorer {
    public Array2DExplorer(){};

    public int minRow(int[][] nums, int row){
        if (nums.length >= row && nums[row].length > 0){
            int min = nums[row][0];

            for (int item : nums[row]){
                if (item < min){
                    min = item;
                }
            }

            return min;
        }

        return -1;
    }

    public int[] colMaxs(int[][] matrix){
        int[] nums = new int[matrix[0].length];

        for (int col = 0; col < matrix[0].length; col++){
            int max = matrix[0][col];

            for (int[] row : matrix){
                if (row[col] > max){
                    max = row[col];
                }
            }

            nums[col] = max;
        }

        return nums;
    }

    public int[] allRowSums(int[][] data){
        int[] sums = new int[data.length];

        for(int row = 0; row < data.length; ++row){
            int sum = 0;

            for (int item : data[row]){
                sum += item;
            }

            sums[row] = sum;
        }

        return sums;
    }

    public double[] averageCol(int[][] nums) {
        double[] vals = new double[nums[0].length];

        for (int col = 0; col < nums[0].length; col++){
            double sum = 0;

            for (int[] row : nums){
                sum += row[col];
            }

            vals[col] = sum / vals.length;
        }

        return vals;
    }

    public int smallEven(int[][] matrix) {
        int min = Integer.MIN_VALUE;

        for (int[] row : matrix){
            for (int item: row){
                if (min%2 == 0 && min < item){
                    min = item;
                }
            }
        }

        if (min == Integer.MIN_VALUE){
            return -1;
        }

        return min;
    }

    public static int biggestRow(int[][] nums) {
        if (nums.length > 0){
            int index = 0;
            int max = 0;

            for (int item: nums[0]){
                max += item;
            }

            for (int row = 0; row < nums.length; ++row){
                int sum = 0;

                for (int item: nums[row]){
                    sum += item;
                }

                if (sum > max){
                    index = row;
                }
            }

            return index;
        }

        return -1;
    }

}
