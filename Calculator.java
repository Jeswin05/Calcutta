import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator {

  public Calculator() {
    Color bgcolor = Color.decode("#54BAB9");
    Color labelcolor =Color.decode("#9ED2C6");

    JFrame frame = new JFrame("Calculator");
    frame.setSize(500, 600);
    frame.setLayout(null);

    JLabel displayLabel = new JLabel();
    displayLabel.setBounds(30, 50, 440, 80);
    displayLabel.setBackground(labelcolor);
    displayLabel.setOpaque(true);


    
    frame.add(displayLabel);
    frame.setVisible(true);
    frame.getContentPane().setBackground(bgcolor);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Calculator();
  }
}
