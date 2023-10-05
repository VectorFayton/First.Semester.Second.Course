package Priority_Queue;

public class Main {
    public static void main(String[] args) {
        EventPlanner events = new EventPlanner();
        events.addEvent("Birthday of nothing", 1);
        events.addEvent("Birthday of Mom", 2);
        events.addEvent("Birthday of Sister", 3);
        events.addEvent("Birthday of Son", 4);
        events.addEvent("Birthday of Dad", 5);
        events.addEvent("Birthday of Friend", 6);
        events.addEvent("Birthday of Wife", 7);
        events.addEvent("New year", 8);
        events.addEvent("Party", 9);
        System.out.println(events.isEmpty());
        System.out.println(events.getNextEvent());
    }
}
