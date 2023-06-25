import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Nama : Muhammad Abiyyu
// NPM : 13119957
// Java For Intemediate - Activity No 4

public class Bola4 extends Applet implements Runnable, ActionListener {
    int x, y, arahX, arahY;
    Button btnUp, btnDown;

    public void init() {
        x = 50;
        y = 50;
        arahX = 2;
        arahY = 2;

        btnUp = new Button("^");
        btnUp.addActionListener(this);
        add(btnUp);

        btnDown = new Button("v");
        btnDown.addActionListener(this);
        add(btnDown);

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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnUp) {
            arahY = -2;
        } else if (e.getSource() == btnDown) {
            arahY = 2;
        }
    }
}
