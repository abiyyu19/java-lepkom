import java.util.Date;

public class ShowTime implements Runnable {

    private ShowTimerFrame STF = new ShowTimerFrame();
    private static Date now = new Date();
    private static int ss = now.getSeconds();
    private int mm = now.getMinutes();
    private int hh = now.getHours();
    private boolean runClock = true;

    public void setSS(int data) {
        ss = data;
    }

    public int getSS(){
        return ss;
    }
    public ShowTime(){
        Thread threadShowTime = new Thread(this);
        threadShowTime.start();
    }
    public void run(){
        while(runClock){
            STF.getTextClock().setText(hh+":"+mm+":"+ss);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException IE){
                IE.printStackTrace();
            }
            ss++;
            clock();
        }
    }
    public void clock(){
        if(ss > 59){
            ss = 0;
            mm = mm + 1;
            if(mm > 59){
                mm = 0;
                hh = hh + 1;
                if(hh > 23){
                    hh = 0;
                }
            }
        }
    }
    public static void addSecond(int seconds){
        ss = ss + seconds;
    }
}