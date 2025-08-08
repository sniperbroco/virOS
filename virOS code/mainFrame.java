import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainFrame extends JFrame {

    public mainFrame() {
        setTitle("virOS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 901, 531);

        initComponents();
    }

    private void initComponents() {
        JPanel mainGame = new JPanel();
        JButton alpha_A = new JButton();
        JButton header = new JButton();

        mainGame.setBackground(new java.awt.Color(227, 207, 32));

        alpha_A.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/com/mycompany/viros/elements/main game/alphabet buttons/A.png")));
        alpha_A.setContentAreaFilled(false);
        alpha_A.setLocation(142, 361);

        header.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/com/mycompany/viros/elements/main game/header.png")));
        header.setContentAreaFilled(false);
        header.setLocation(55, 45);
    }

    public static void main(String args[]) {
        new mainFrame();
    }
}