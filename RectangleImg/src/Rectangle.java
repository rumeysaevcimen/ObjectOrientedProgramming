import javax.swing.*;
import java.awt.*;

class Panel extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(50, 50, 100, 50);
    }
}
public class Rectangle {
    public static void main(String[] args) {

        Panel p = new Panel();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame panel = new JFrame("Rectangle");
        panel.setSize(300,200);
        panel.setLocation(300,300);
        panel.setBackground(Color.pink);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(p);
        panel.setVisible(true);
    }
}
