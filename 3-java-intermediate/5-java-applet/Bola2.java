import java.applet.*;
import java.awt.*;

// Nama : Muhammad Abiyyu
// NPM : 13119957
// Java For Intemediate - Activity No 2

public class Bola2 extends Applet implements Runnable {
    int y, arahY;

    public void init() {
        y = 50;
        arahY = 2;

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(5, 5, 240, 240);
        g.setColor(Color.red);
        g.fillOval(50, y, 20, 20);
    }

    public void run() {
        while (true) {
            try {
                cekBola();
                Thread.sleep(5);
                repaint();
            } catch (Exception e) {
                // do nothing
            }
        }
    }

    public void cekBola() {
        if (y > 225 || y < 5) {
            arahY = -arahY;
        }
        y = y + arahY;
    }
}
