import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ShowTimerFrame extends JFrame implements ActionListener {
    private JTextField textClock;

    public ShowTimerFrame() {
        initWindow();
    }

    public JTextField getTextClock() {
        return textClock;
    }

    public void initWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setBounds(0, 0, 500, 300);
        setTitle("Multi Thread Abiyyu - 13119957");
        textClock = new JTextField();
        textClock.setLocation(5, 10);
        textClock.setSize(new Dimension(89, 25));
        textClock.setHorizontalAlignment(JTextField.CENTER);
        textClock.setEditable(false);
        JButton addSec = new JButton("add 10 seconds");
        addSec.setLocation(90, 10);
        addSec.setSize(new Dimension(150, 25));
        addSec.addActionListener(this);
        getContentPane().setLayout(null);
        getContentPane().add(textClock);
        getContentPane().add(addSec);
        setVisible(true);
    }

    public synchronized void actionPerformed(ActionEvent event) {
        ShowTime.addSecond(20);
    }
}