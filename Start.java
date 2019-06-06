import javax.naming.ldap.PagedResultsControl;
import java.util.ArrayList;
import java.util.Random;

public class Start {
    private int id;
    private int timeWaite;
    private int RequestTime;
    private int freeProccesorTime;
    Request request;


    private int timeExecutingRequest() {
        Random random = new Random();
        return random.nextInt(10);
    }

    //Random access to request into Buffer


    // Пока заявки в очереди добавляем к ним время простоя
    // И проверям не пришли ли новые заявки если да то добавляем в очередь
    public void UpdateSystem(int timeWaite) {
        Buffer buffer = new Buffer();
        if(buffer.bufferSize()!=0){
            for (int i = 0; i < buffer.bufferSize(); i++) {
                buffer.getQueueWaitingsRequests().setTimeWaitingInSystem(timeWaite);

            }
        }


    }

    public void createRequest(int timeCome) {

        Start start = new Start();
        Buffer buffer = new Buffer();
        if (buffer.bufferSize()==0){

        }
        int idRequest = 1;
        idRequest = buffer.bufferSize() + 1;

        Request request = new Request(idRequest, start.timeExecutingRequest(), timeCome);

        buffer.setQueueWaitingsRequests(request);

        System.out.print("ID request: " + buffer.getQueueWaitingsRequests(idRequest).getId() + " ");
        System.out.print("Time Executing: " + buffer.getQueueWaitingsRequests(idRequest).getTimeService() + " ");
        System.out.println("TimeWaitingInSystem: " + buffer.getQueueWaitingsRequests(idRequest).getTimeWaitingInSystem() + " ");
        System.out.println(buffer.getQueueWaitingsRequests(idRequest));

        System.out.println("Buffer size: " + buffer.bufferSize());
    }


    public static void main(String[] args) {
    Start start = new Start();
    start.createRequest(4);

    }
}
