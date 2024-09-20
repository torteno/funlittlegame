import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JLabel;


public class myFrame extends JFrame implements KeyListener {

    JLabel label;

    myFrame() {
        JFrame frame = new JFrame("My Frame!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,1000);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        frame.add(label);
        frame.getContentPane().setBackground(Color.blue);
        frame.setLayout(null);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // System.out.println("You Released the Keychar:" + e.getKeyChar());
        System.out.println("You Released the KeyCode:" + e.getKeyCode());
        if(e.getKeyChar() == 'w') {
            System.out.println("You moved forwards!");
        }
    }
}
