
package countdown;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author edgardpacheco
 */

public class Countdown {
    
static int interval;
static Timer timer;

    public static void main(String[] args) {
        
    System.out.print("##X= You Have 30 second to run before the bomb explode! =X## Runnnn \n");

    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = 30;
    System.out.println(interval);
    timer.scheduleAtFixedRate(new TimerTask() {

    public void run() {
            System.out.println(setInterval());

        }
    }, delay, period);
}

    private static final int setInterval() {
    if (interval == 1)
        timer.cancel();
     
    return --interval;
   
    }
        
}
