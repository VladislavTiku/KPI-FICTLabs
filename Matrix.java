import java.util.*;

//Collection
public class Matrix {

    private int rows;
    private int columns;

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    // Initialisation of variable


    //Initialisation matrix



    /**
     * @return Random number in range 10000
     */
    private int get_Rundom_Numbers(){
        Random random = new Random();
        return random.nextInt(1000);
    }


    /**
     * Fill the marix randoms numbers range 1000
     * Colums an d rows is 10x10
     * @return
     */
    public int[][] fill_matrix(){
        int[][] matrix_1 = new int[rows][columns];
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[i].length ; j++) {
                matrix_1[i][j] = get_Rundom_Numbers();
               //System.out.println(matrix_1[i][j]+"\t "+"Index: "+i+" "+j);
            }
           // System.out.println();


        }

        return matrix_1;
    }




    /**
     * @param matrix Matrix which we want to show
     */
    public void showMatrix(int [][] matrix) {
        for (int [] row : matrix) {
            for (int elem : row)
                System.out.printf("%3d ", elem);
            System.out.println();
        }
    }
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


        //showMatrix(multAxB(matrix.fill_matrix(5,5),matrix.fill_matrix(5,5)));
    // заносим значения

        long start = System.currentTimeMillis();		            // до



        long finish = System.currentTimeMillis();                   //после
        //Executiong time of algoritm
        long timeConsumedMillis = finish - start;
        System.out.println("Execution is: "+timeConsumedMillis + " ms");
    }



}