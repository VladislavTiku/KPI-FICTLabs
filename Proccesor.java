import java.util.ArrayList;
import java.util.Random;

/*
    Процесор получает на вход две матриции и помещает а очередь.
    Выполняет запрос з стека, вибирает рандом с cтека и удаяет
*/
public class Proccesor {
    private Random random = new Random();
    private int CurrentTIME = 0;
    private int id_Task_Procces;
    private boolean ProccesorStatus = true;
    Request request;
    private ArrayList<Request> requestArrayList = new ArrayList<>();
    int StopTime;
    // Создаем два списка
    private ArrayList<int[][]> inputList = new ArrayList<>();
    private ArrayList<Request> ResolveTasks = new ArrayList<>();
    Exception emptyArray;

//-------------------------------------------------------------------
    // Процесор получает на вход две матрици и помещает их в очередь
//        Proccesor(int[][] MATRIX1_INPUT, int[][] MATRIX2_INPUT) {
//        this.MATRIX1_INPUT = MATRIX1_INPUT;
//        this.MATRIX2_INPUT = MATRIX2_INPUT;
//    }


private int ExecutingTIME(){
    return random.nextInt(10);
}

//-------------------------------------------------------------------
//Take the lenth of queue and return random task
    private int RandomChoice() {
        Random random = new Random();
        int sizeOfTurn = requestArrayList.size();
        //Check queue for tasks
        if(sizeOfTurn==0){
            return 0;
        }

        System.out.println(sizeOfTurn);

        int a = random.nextInt(sizeOfTurn);
        return a;
    }



// Берет с очереди рандомно таск и выполняет его в такс помещает о том когда началась обработка и когда заккончилась
    private void Executing()throws Exception{
        int TaskID = RandomChoice();
        if(requestArrayList.size()!=0) {
            requestArrayList.get(TaskID).setTimeBeginProc(CurrentTIME);
            CurrentTIME += requestArrayList.get(TaskID).getTimeService();

            requestArrayList.get(TaskID).setTimeEndProc(CurrentTIME);

            ResolveTasks.add(requestArrayList.get(TaskID));
            requestArrayList.remove(TaskID);
        }else {
            throw emptyArray;
        }
    }


    public void Request(){

    }



    //Выполнение

//Метод для запросов которые простаивают
    //на каждой итерации увеличиваем время ожидания взависимости обработки запроса




    public static void main(String[] args) throws Exception {
    Random random = new Random();
    int info = random.nextInt(3);
        Proccesor proccesor = new Proccesor();

        Request request = new Request(proccesor.id_Task_Procces++, proccesor.ExecutingTIME(), proccesor.CurrentTIME);
            proccesor.requestArrayList.add(request);

        while (proccesor.requestArrayList.size()>0) {
            if (info==1){
                Request request1 = new Request(proccesor.id_Task_Procces++, proccesor.ExecutingTIME(), proccesor.CurrentTIME);
                proccesor.requestArrayList.add(request1);
                info++;
            }
            proccesor.Executing();

            //Initialisate time execution current time and + to all another tasks in
            int timeExecutionCurrentTask = proccesor.requestArrayList.get(proccesor.id_Task_Procces).getTimeService();
            for (int j = 0; j < proccesor.requestArrayList.size(); j++) {
                proccesor.requestArrayList.get(j).setTimeWaitingInSystem(timeExecutionCurrentTask);

            }
//        for (int i = 0; i < 4 ; i++) {
//
//            if(proccesor.ProccesorStatus){
//                //RANDOM CHOICE
//                proccesor.id_Task_Procces = proccesor.RandomChoice();
//
//                }
//            }



                System.out.println("Status of Proc "+proccesor.ProccesorStatus);
            System.out.println("Current Time " + proccesor.CurrentTIME);




        }

        }



        //int [][] mat = times(matrix.getMatrix_1(),matrix.getMatrix_1());





    }






