import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator {

  public Calculator() {
    Color bgcolor = Color.decode("#54BAB9");
    Color labelcolor =Color.decode("#9ED2C6");

    JFrame frame = new JFrame("Calculator");
    frame.setSize(450, 700);
    frame.setLayout(null);

    JLabel displayLabel = new JLabel();
    displayLabel.setBounds(30, 50, 380, 80);
    displayLabel.setBackground(labelcolor);
    displayLabel.setOpaque(true);


    //
    //FirstBloc
    //


      //ClearButton
      JButton clrbutton=new JButton("C");
      clrbutton.setBounds(30,150,80,80);

      //DivisionButton
      JButton divisionbutton=new JButton("/");
      divisionbutton.setBounds(130,150,80,80);

      //MultiplyButton
      JButton multiplybutton=new JButton("X");
      multiplybutton.setBounds(230,150,80,80);

      //SubtractionButton
      JButton subtractionbutton=new JButton("-");
      subtractionbutton.setBounds(330,150,80,80);


    //
    //SecondBloc
    //


      //Sevenbutton
      JButton sevenbutton=new JButton("7");
      sevenbutton.setBounds(30,250,80,80);

      //EightButton
      JButton eightbutton=new JButton("8");
      eightbutton.setBounds(130,250,80,80);

      //NineButton
      JButton ninebutton=new JButton("9");
      ninebutton.setBounds(230,250,80,80);

      //additionButton
      JButton additionbutton=new JButton("+");
      additionbutton.setBounds(330,250,80,180);


    //
    //ThirdBloc
    //


      //Fourbutton
      JButton fourbutton=new JButton("4");
      fourbutton.setBounds(30,350,80,80);

      //FiveButton
      JButton fivebutton=new JButton("5");
      fivebutton.setBounds(130,350,80,80);

      //SixButton
      JButton sixbutton=new JButton("6");
      sixbutton.setBounds(230,350,80,80);

    
    //
    //FourthBloc
    //


      //OneButton
      JButton onebutton=new JButton("1");
      onebutton.setBounds(30,450,80,80);

      //TwoButton
      JButton twobutton=new JButton("2");
      twobutton.setBounds(130,450,80,80);

      //ThreeButton
      JButton threebutton=new JButton("3");
      threebutton.setBounds(230,450,80,80);

      //EnterButton
      JButton enterbutton=new JButton("=");
      enterbutton.setBounds(330,450,80,180);


    //
    //FivthBloc
    //


      //ZeroButton
      JButton zerobutton=new JButton("0");
      zerobutton.setBounds(30,550,180,80);

      //decimalbutton
      JButton decimalbutton=new JButton(".");
      decimalbutton.setBounds(230,550,80,80);





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
}
