import javax.swing.*;
import java.awt.*;

public class Gui extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
//        int width = getWidth();
//        int height = getHeight();
//        g.setColor(Color.BLUE);
//        g.fillRect(0,0, width, height);
//        g.setColor(Color.RED);
//        g.drawLine(10, 10, 50, 50);
//        g.setColor(Color.GREEN);
//        g.fillOval(5, 5, 200, 200);
        ImageIcon imageIcon = new ImageIcon("dog.png");
        imageIcon.paintIcon(null, g, 50, 50);
    }


    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setContentPane(new Gui());
        window.setVisible(true);
    }
}
