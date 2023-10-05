package Priority_Queue;

public class Event implements Comparable<Event>{
    String event_name = "";
    int start_time = 0;

    public Event(String event_name, int start_time){
        this.event_name = event_name;
        this.start_time = start_time;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }
//    @Override
    public int compareTo(Event o) {
        if (start_time > o.getStart_time()){
            return 1;
        } else if (start_time < o.getStart_time()){
            return -1;
        } else
            return 0;
    }
}
