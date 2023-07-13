import javax.swing.*;
import java.awt.*;

public class soal1 extends JFrame {
    public soal1() {
        // Muhammad Abiyyu
        // 4KA21
        // 13119957

        // Membuat panel pertama
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JButton("One"));
        panel1.add(new JButton("Two"));
        panel1.add(new JButton("Three"));

        // Membuat panel kedua
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JButton("Four"));
        panel2.add(new JButton("Five"));

        // Membuat panel Grid layout untuk membungkus kedua FlowLayout

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(2, 0));
        panel3.add(panel1);
        panel3.add(panel2);

        this.add(panel3);
        this.setTitle("13119957"); // isi dengan NPM kalian
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 100);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        soal1 app = new soal1();
    }
}