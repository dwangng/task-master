// import javafx.application.Application;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorld {

    public static void main(String[] args){
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> System.out.println("Hello, Swing"));

        JPanel panel = new JPanel();
        panel.add(button);

        frame.add(panel);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
