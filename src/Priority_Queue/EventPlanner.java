package Priority_Queue;

import java.util.PriorityQueue;

public class EventPlanner {
    PriorityQueue<Event> priority_queue = new PriorityQueue<Event>();

     void addEvent(String event_name, int start_time) {
        priority_queue.add(new Event(event_name, start_time));
    }
     boolean isEmpty(){
        return priority_queue.isEmpty();
    }
     String getNextEvent(){
        Event event = priority_queue.poll();
        return event.getEvent_name();
    }
}
