/**
 * Created by Tiku Vladislav
 * 29.05.2019
 */
public class Request {
    private int id; // айді запроса
    private int timeService;//время обработки заявки
    private int timeCome; //время прихода заявки в очередь
    private int timeWaitingInSystem; // время простоя в очереди
    private int timeBeginExecuting; //время начала обработки
    private int timeEndExecuting; //время окончание обработки

    public Request(int id, int timeService, int timeCome){
        this.id = id;
        this.timeService = timeService;
        this.timeCome = timeCome;
    }

    public int getTimeEndExecuting() {
        return timeEndExecuting;
    }
    public void setTimeEndExecuting(int timeEndExecuting) {
        this.timeEndExecuting = timeEndExecuting;
    }
    public int getTimeBeginExecuting() {
        return timeBeginExecuting;
    }
    public void setTimeBeginExecuting(int timeBeginExecuting) {
        this.timeBeginExecuting += timeBeginExecuting;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTimeService() {
        return timeService;
    }

    public int getTimeCome() {
        return timeCome;
    }
    public void setTimeCome(int timeCome) {
        this.timeCome = timeCome;
    }
    public String toString(){
        return id +";"+";"+ timeService +";"
                + timeCome +";"+ timeBeginExecuting +";"+ timeEndExecuting +"\n";
    }


    public int getTimeWaitingInSystem() {
        return timeWaitingInSystem;
    }

    public void setTimeWaitingInSystem(int timeWaitingInSystem) {
        this.timeWaitingInSystem += timeWaitingInSystem;
    }
}
