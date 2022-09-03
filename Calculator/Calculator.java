import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

public class Calculator implements ActionListener {
  boolean isoperatorClicked = false;
  String oldValue;
  int operator;
  JButton clrbutton;
  JButton divisionbutton;
  JButton multiplybutton;
  JButton additionbutton;
  JButton subtractionbutton;
  JButton ninebutton;
  JButton eightbutton;
  JButton sevenbutton;
  JButton sixbutton;
  JButton fivebutton;
  JButton fourbutton;
  JButton threebutton;
  JButton twobutton;
  JButton onebutton;
  JButton zerobutton;
  JButton decimalbutton;
  JButton enterbutton;

  JLabel displayLabel;

  public Calculator() {
    Color bgcolor = Color.decode("#54BAB9");
    Color labelcolor = Color.decode("#F7ECDE");
    Color buttoncolor = Color.decode("#E9DAC1");

    JFrame frame = new JFrame("Calculator");
    frame.setSize(450, 700);
    frame.setLayout(null);

    displayLabel = new JLabel("", JLabel.RIGHT);
    displayLabel.setBounds(30, 50, 380, 80);
    displayLabel.setBackground(labelcolor);
    displayLabel.setOpaque(true);
    displayLabel.setBorder(new EmptyBorder(0,0,0,10));

    //
    //FirstBloc
    //

    //ClearButton
    clrbutton = new JButton("C");
    clrbutton.setBounds(30, 150, 80, 80);
    clrbutton.addActionListener(this);

    //DivisionButton
    divisionbutton = new JButton("/");
    divisionbutton.setBounds(130, 150, 80, 80);
    divisionbutton.addActionListener(this);

    //MultiplyButton
    multiplybutton = new JButton("X");
    multiplybutton.setBounds(230, 150, 80, 80);
    multiplybutton.addActionListener(this);

    //SubtractionButton
    subtractionbutton = new JButton("-");
    subtractionbutton.setBounds(330, 150, 80, 80);
    subtractionbutton.addActionListener(this);

    //
    //SecondBloc
    //

    //Sevenbutton
    sevenbutton = new JButton("7");
    sevenbutton.setBounds(30, 250, 80, 80);
    sevenbutton.addActionListener(this);

    //EightButton
    eightbutton = new JButton("8");
    eightbutton.setBounds(130, 250, 80, 80);
    eightbutton.addActionListener(this);

    //NineButton
    ninebutton = new JButton("9");
    ninebutton.setBounds(230, 250, 80, 80);
    ninebutton.addActionListener(this);

    //additionButton
    additionbutton = new JButton("+");
    additionbutton.setBounds(330, 250, 80, 180);
    additionbutton.addActionListener(this);

    //
    //ThirdBloc
    //

    //Fourbutton
    fourbutton = new JButton("4");
    fourbutton.setBounds(30, 350, 80, 80);
    fourbutton.addActionListener(this);

    //FiveButton
    fivebutton = new JButton("5");
    fivebutton.setBounds(130, 350, 80, 80);
    fivebutton.addActionListener(this);

    //SixButton
    sixbutton = new JButton("6");
    sixbutton.setBounds(230, 350, 80, 80);
    sixbutton.addActionListener(this);
    //
    //FourthBloc
    //
    //OneButton
    onebutton = new JButton("1");
    onebutton.setBounds(30, 450, 80, 80);
    onebutton.addActionListener(this);

    //TwoButton
    twobutton = new JButton("2");
    twobutton.setBounds(130, 450, 80, 80);
    twobutton.addActionListener(this);

    //ThreeButton
    threebutton = new JButton("3");
    threebutton.setBounds(230, 450, 80, 80);
    threebutton.addActionListener(this);

    //EnterButton
    enterbutton = new JButton("=");
    enterbutton.setBounds(330, 450, 80, 180);
    enterbutton.addActionListener(this);

    //
    //FivthBloc
    //

    //ZeroButton
    zerobutton = new JButton("0");
    zerobutton.setBounds(30, 550, 180, 80);
    zerobutton.addActionListener(this);

    //decimalbutton
    decimalbutton = new JButton(".");
    decimalbutton.setBounds(230, 550, 80, 80);
    decimalbutton.addActionListener(this);

    //Color
    clrbutton.setBackground(buttoncolor);
    divisionbutton.setBackground(buttoncolor);
    multiplybutton.setBackground(buttoncolor);
    additionbutton.setBackground(buttoncolor);
    subtractionbutton.setBackground(buttoncolor);
    ninebutton.setBackground(buttoncolor);
    eightbutton.setBackground(buttoncolor);
    sevenbutton.setBackground(buttoncolor);
    sixbutton.setBackground(buttoncolor);
    fivebutton.setBackground(buttoncolor);
    fourbutton.setBackground(buttoncolor);
    threebutton.setBackground(buttoncolor);
    twobutton.setBackground(buttoncolor);
    onebutton.setBackground(buttoncolor);
    zerobutton.setBackground(buttoncolor);
    decimalbutton.setBackground(buttoncolor);
    enterbutton.setBackground(buttoncolor);

    //Font
    displayLabel.setFont(new Font("Montserrat", Font.TYPE1_FONT, 25));
    clrbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    divisionbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    multiplybutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    additionbutton.setFont(new Font("Montserrat", Font.PLAIN, 35));
    subtractionbutton.setFont(new Font("Montserrat", Font.PLAIN, 35));
    ninebutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    eightbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    sevenbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    sixbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    fivebutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    fourbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    threebutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    twobutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    onebutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    zerobutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    decimalbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));
    enterbutton.setFont(new Font("Montserrat", Font.PLAIN, 25));

    frame.add(decimalbutton);
    frame.add(zerobutton);
    frame.add(enterbutton);
    frame.add(threebutton);
    frame.add(twobutton);
    frame.add(onebutton);
    frame.add(sixbutton);
    frame.add(fivebutton);
    frame.add(fourbutton);
    frame.add(additionbutton);
    frame.add(sevenbutton);
    frame.add(eightbutton);
    frame.add(ninebutton);
    frame.add(subtractionbutton);
    frame.add(multiplybutton);
    frame.add(divisionbutton);
    frame.add(clrbutton);
    frame.add(displayLabel);
    frame.setVisible(true);
    frame.getContentPane().setBackground(bgcolor);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new Calculator();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == clrbutton) {
      displayLabel.setText("");
      isoperatorClicked =false;
      operator=0;
    } else if (e.getSource() == divisionbutton) {
      oldValue = displayLabel.getText();
      isoperatorClicked = true;
      String newValue = displayLabel.getText();

      float oldValueF = Float.parseFloat(oldValue);
      float newValueF = Float.parseFloat(newValue);

      if (operator == 1) {
        float result = oldValueF / newValueF;
        oldValue = result + "";
      } else if (operator == 2) {
        float result = oldValueF * newValueF;
        oldValue = result + "";
      } else if (operator == 3) {
        float result = oldValueF - newValueF;
        oldValue = result + "";
      } else if (operator == 4) {
        float result = oldValueF + newValueF;
        oldValue = result + "";
      }
      operator = 2;
      operator = 1;
    } else if (e.getSource() == multiplybutton) {
      oldValue = displayLabel.getText();
      isoperatorClicked = true;
      String newValue = displayLabel.getText();

      float oldValueF = Float.parseFloat(oldValue);
      float newValueF = Float.parseFloat(newValue);

      if (operator == 1) {
        float result = oldValueF / newValueF;
        oldValue = result + "";
      } else if (operator == 2) {
        float result = oldValueF * newValueF;
        oldValue = result + "";
      } else if (operator == 3) {
        float result = oldValueF - newValueF;
        oldValue = result + "";
      } else if (operator == 4) {
        float result = oldValueF + newValueF;
        oldValue = result + "";
      }
      operator = 2;
    } else if (e.getSource() == subtractionbutton) {
      oldValue = displayLabel.getText();
      isoperatorClicked = true;
      String newValue = displayLabel.getText();

      float oldValueF = Float.parseFloat(oldValue);
      float newValueF = Float.parseFloat(newValue);

      if (operator == 1) {
        float result = oldValueF / newValueF;
        oldValue = result + "";
      } else if (operator == 2) {
        float result = oldValueF * newValueF;
        oldValue = result + "";
      } else if (operator == 3) {
        float result = oldValueF - newValueF;
        oldValue = result + "";
      } else if (operator == 4) {
        float result = oldValueF + newValueF;
        oldValue = result + "";
      }
      operator = 2;
      operator = 3;
    } else if (e.getSource() == additionbutton) {
      oldValue = displayLabel.getText();
      isoperatorClicked = true;
      String newValue = displayLabel.getText();

      float oldValueF = Float.parseFloat(oldValue);
      float newValueF = Float.parseFloat(newValue);

      if (operator == 1) {
        float result = oldValueF / newValueF;
        oldValue = result + "";
      } else if (operator == 2) {
        float result = oldValueF * newValueF;
        oldValue = result + "";
      } else if (operator == 3) {
        float result = oldValueF - newValueF;
        oldValue = result + "";
      } else if (operator == 4) {
        float result = oldValueF + newValueF;
        oldValue = result + "";
      }
      operator = 2;
      operator = 4;
    } else if (e.getSource() == enterbutton) {
      String newValue = displayLabel.getText();

      float oldValueF = Float.parseFloat(oldValue);
      float newValueF = Float.parseFloat(newValue);

      if (operator == 1) {
        float result = oldValueF / newValueF;
        displayLabel.setText(result + "");
      } else if (operator == 2) {
        float result = oldValueF * newValueF;
        displayLabel.setText(result + "");
      } else if (operator == 3) {
        float result = oldValueF - newValueF;
        displayLabel.setText(result + "");
      } else if (operator == 4) {
        float result = oldValueF + newValueF;
        displayLabel.setText(result + "");
      }
    }
    //Numbers

    else if (e.getSource() == sevenbutton) {
      if (isoperatorClicked) {
        displayLabel.setText("7");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "7");
      }
    } else if (e.getSource() == eightbutton) {
      if (isoperatorClicked) {
        displayLabel.setText("8");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "8");
      }
    } else if (e.getSource() == ninebutton) {
      if (isoperatorClicked) {
        displayLabel.setText("9");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "9");
      }
    } else if (e.getSource() == fourbutton) {
      if (isoperatorClicked) {
        displayLabel.setText("4");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "4");
      }
    } else if (e.getSource() == fivebutton) {
      if (isoperatorClicked) {
        displayLabel.setText("5");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "5");
      }
    } else if (e.getSource() == sixbutton) {
      if (isoperatorClicked) {
        displayLabel.setText("6");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "6");
      }
    } else if (e.getSource() == onebutton) {
      if (isoperatorClicked) {
        displayLabel.setText("1");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "1");
      }
    } else if (e.getSource() == twobutton) {
      if (isoperatorClicked) {
        displayLabel.setText("2");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "2");
      }
    } else if (e.getSource() == threebutton) {
      if (isoperatorClicked) {
        displayLabel.setText("3");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "3");
      }
    } else if (e.getSource() == zerobutton) {
      if (isoperatorClicked) {
        displayLabel.setText("0");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + "0");
      }
    } else if (e.getSource() == decimalbutton) {
      if (isoperatorClicked) {
        displayLabel.setText(".");
        isoperatorClicked = false;
      } else {
        displayLabel.setText(displayLabel.getText() + ".");
      }
    }
  }
}
