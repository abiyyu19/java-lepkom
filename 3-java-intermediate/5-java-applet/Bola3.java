import java.applet.*;
import java.awt.*;

// Nama : Muhammad Abiyyu
// NPM : 13119957
// Java For Intemediate - Activity No 3

public class Bola3 extends Applet implements Runnable {
    int x, arahX;
    int y, arahY;

    public void init() {
        x = 50;
        arahX = 2;
        y = 50;
        arahY = 2;

        Thread t = new Thread(this);
        t.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(5, 5, 240, 240);
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
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
        if (x > 225 || x < 5) {
            arahX = -arahX;
        }
        if (y > 225 || y < 5) {
            arahY = -arahY;
        }
        x = x + arahX;
        y = y + arahY;
    }
}
