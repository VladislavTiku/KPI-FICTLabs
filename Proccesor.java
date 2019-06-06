import java.util.Random;

/*
    Процесор получает на вход две матриции и помещает а очередь.
    Выполняет запрос з стека, вибирает рандом с cтека и удаяет
*/
public class Proccesor {
    private Random random = new Random();
    public  int CurrentTIME = 0;
    private int id_Task_Procces;
    private boolean ProccesorStatus = true;


    public int getCurrentTIME(){
        return CurrentTIME;
    }
    private int ExecutingTIME() {
        return random.nextInt(10);
    }

//-------------------------------------------------------------------
//Take the lenth of queue and return random task


    // Б
    private void Executing(Request request) {
        ProccesorStatus = false;
        request.setTimeBeginExecuting(CurrentTIME);
        CurrentTIME+=request.getTimeService();
        request.setTimeEndExecuting(CurrentTIME);
        ProccesorStatus = true;
    }
}


