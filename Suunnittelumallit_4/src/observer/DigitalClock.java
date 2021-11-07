package observer;

import java.util.Observer;
import java.util.Observable;

public class DigitalClock implements Observer {
    private ClockTimer timer;
    
    public DigitalClock(ClockTimer ct){
        timer = ct;
        timer.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg){
        if (timer == o) {
        	draw();
        }
    }
    
    private void draw(){
        int hour = timer.getHour();
        int min = timer.getMinute();
        int sec = timer.getSecond();
        System.out.println(hour + ":" + min + ":" + sec);
    }
    
}