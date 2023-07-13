import javax.swing.*;
import java.awt.*;

public class soal2 extends JFrame {
    public soal2() {
        // Muhammad Abiyyu
        // 4KA21
        // 13119957

        // Membuat grid layout pertama
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        panel1.add(new JButton("One"));
        panel1.add(new JButton("Two"));
        panel1.add(new JButton("Three"));
        panel1.add(new JButton("Four"));
        panel1.add(new JButton("Five"));

        // Membuat grid layout kedua
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 2));
        panel2.add(new JButton("A"));
        panel2.add(new JButton("B"));
        panel2.add(new JButton("C"));
        panel2.add(new JButton("D"));
        panel2.add(new JButton("E"));

        // Membuat grid layout ketiga untuk membungkus 2 layout sebelumnya
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 0));
        panel3.add(panel1);
        panel3.add(panel2);

        this.add(panel3);
        this.setTitle("53419999"); // Isi dengan NPM Kalian
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        soal2 app = new soal2();
    }
}
