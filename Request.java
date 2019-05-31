/**
 * Created by Tiku Vladislav
 * 29.05.2019
 */
public class Request {
    private int id;
    private int timeService;//время обработки заявки
    private int timeCome; //время прихода заявки в очередь
    private int timeWaitingInSystem; // время простоя в очереди
    private int timeBeginProc; //время начала обработки
    private int timeEndProc; //время окончание обработки

    public Request(int id, int timeService, int timeCome){
        this.id = id;
        this.timeService = timeService;
        this.timeCome = timeCome;
    }

    public int getTimeEndProc() {
        return timeEndProc;
    }
    public void setTimeEndProc(int timeEndProc) {
        this.timeEndProc = timeEndProc;
    }
    public int getTimeBeginProc() {
        return timeBeginProc;
    }
    public void setTimeBeginProc(int timeBeginProc) {
        this.timeBeginProc = timeBeginProc;
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
    public void setTimeService(int timeService) {
        this.timeService = timeService;
    }
    public int getTimeCome() {
        return timeCome;
    }
    public void setTimeCome(int timeCome) {
        this.timeCome = timeCome;
    }
    public String toString(){
        return id +";"+";"+ timeService +";"
                + timeCome +";"+ timeBeginProc +";"+ timeEndProc +"\n";
    }


    public int getTimeWaitingInSystem() {
        return timeWaitingInSystem;
    }

    public void setTimeWaitingInSystem(int timeWaitingInSystem) {
        this.timeWaitingInSystem += timeWaitingInSystem;
    }
}
