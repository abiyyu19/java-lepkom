import javax.swing.*;
import java.awt.*;

public class soal3 extends JFrame {
    // Muhammad Abiyyu
    // 4KA21
    // 13119957

    private GridBagConstraints constraints;

    private void addGB(Component component, int x, int y) {
        constraints.gridx = x;
        constraints.gridy = y;
        this.add(component, constraints);
    }

    public soal3() {
        constraints = new GridBagConstraints();
        this.setLayout(new GridBagLayout());

        int x, y;

        this.addGB(new JButton("North"), x = 1, y = 0);
        this.addGB(new JButton("West"), x = 0, y = 1);
        this.addGB(new JButton("Center"), x = 1, y = 1);
        this.addGB(new JButton("East"), x = 2, y = 1);
        this.addGB(new JButton("South"), x = 1, y = 2);

        this.setTitle("13119957"); // Isi dengan NPM Kalian
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(225, 250);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        soal3 app = new soal3();
    }
}
