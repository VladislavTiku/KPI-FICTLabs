import java.util.ArrayList;
import java.util.Random;

class Buffer {
    private int randomChoicetoAccessToBuffer() {
        Random random = new Random();
        Buffer buffer = new Buffer();
        return random.nextInt(buffer.queueWaitingsRequests.size());
    }

    ArrayList<Request> queueWaitingsRequests = new ArrayList<>();

    int bufferSize(){
        return queueWaitingsRequests.size();
    }

    Request getQueueWaitingsRequests() {
        return queueWaitingsRequests.get(randomChoicetoAccessToBuffer());
    }

    void setQueueWaitingsRequests(Request requests) {
        Proccesor proccesor = new Proccesor();
        requests.setTimeCome(proccesor.getCurrentTIME());
        queueWaitingsRequests.add(requests);
    }
}
