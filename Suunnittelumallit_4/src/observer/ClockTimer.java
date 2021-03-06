
package observer;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimer extends Observable {
    private int sec = 0;
    private int min = 0;
    private int hour = 0;
    
    private Timer timer = new Timer(true);
    private TimerTask tTask = new callTick();
    
    public ClockTimer() {
    	timer.schedule(tTask, 0, 1000);
    }
    
	public void tick() {
        sec++;
        if (sec >= 60) {
            sec = 0;
            min++;
        }
        if (min >= 60) {
            min = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }
        setChanged();
        notifyObservers();
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return min;
    }
    
    public int getSecond() {
        return sec;
    }
    
    private class callTick extends TimerTask {

        @Override
        public void run() {
            tick();
        }        
    }
    
}