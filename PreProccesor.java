public class PreProccesor {
    private static int [] getRow(int numRow, int [][] array) {
        return array[numRow];
    }

    private static int [] getColomn(int numCol, int [][] array) {
        int [] retColomn = new int[array.length];
        for (int i = 0; i < retColomn.length; i++) {
            retColomn[i] = array[i][numCol];
        }
        return retColomn;
    }

    private static int getSumOfMultRewColomn(int [] rowA, int [] colomnB) {
        int summRet = 0;
        for (int i = 0; i < rowA.length; i++) {
            summRet += rowA[i] * colomnB[i];
        }
        return summRet;
    }

    /**
     * @param a First matrix
     * @param b Second matrix
     * @return matrix
     */
    public int[][] multAxB(int [][] a, int [][] b) {
        int [][] result = new int [a.length][b[0].length];
        for (int rRes = 0; rRes < result.length; rRes++) {
            for (int cRes = 0; cRes < result[0].length; cRes++) {
                result[rRes][cRes] = getSumOfMultRewColomn(getRow(rRes,a), getColomn(cRes,b));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Matrix matrix = new Matrix(5,5);
        int [][] m = matrix.fill_matrix();
        //matrix.showMatrix(multAxB(m,m));
    }


}
