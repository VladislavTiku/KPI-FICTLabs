import java.util.*;

//Collection
public class Matrix {
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
    public int[][] fill_matrix(int columns, int rows){
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




    public static void main(String[] args) {


    // заносим значения

        long start = System.currentTimeMillis();		            // до



        long finish = System.currentTimeMillis();                   //после
        //Executiong time of algoritm
        long timeConsumedMillis = finish - start;
        System.out.println("Execution is: "+timeConsumedMillis + " ms");
    }



}