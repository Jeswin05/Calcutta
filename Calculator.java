import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Calculator implements ActionListener   {


  JButton clrbutton;
  JButton divisionbutton;
  JButton multiplybutton;
  JButton additionbutton;
  JButton multiplybuttton;
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
    Color labelcolor =Color.decode("#9ED2C6");

    JFrame frame = new JFrame("Calculator");
    frame.setSize(450, 700);
    frame.setLayout(null);

     displayLabel = new JLabel();
    displayLabel.setBounds(30, 50, 380, 80);
    displayLabel.setBackground(labelcolor);
    displayLabel.setOpaque(true);


    //
    //FirstBloc
    //


      //ClearButton
      clrbutton=new JButton("C");
      clrbutton.setBounds(30,150,80,80);
      clrbutton.addActionListener(this);

      //DivisionButton
      divisionbutton=new JButton("/");
      divisionbutton.setBounds(130,150,80,80);
      divisionbutton.addActionListener(this);

      //MultiplyButton
      multiplybutton=new JButton("X");
      multiplybutton.setBounds(230,150,80,80);
      multiplybutton.addActionListener(this);

      //SubtractionButton
      subtractionbutton=new JButton("-");
      subtractionbutton.setBounds(330,150,80,80);
      subtractionbutton.addActionListener(this);


    //
    //SecondBloc
    //


      //Sevenbutton
      sevenbutton=new JButton("7");
      sevenbutton.setBounds(30,250,80,80);
      sevenbutton.addActionListener(this);

      //EightButton
      eightbutton=new JButton("8");
      eightbutton.setBounds(130,250,80,80);
      eightbutton.addActionListener(this);

      //NineButton
      ninebutton=new JButton("9");
      ninebutton.setBounds(230,250,80,80);
      ninebutton.addActionListener(this);

      //additionButton
      additionbutton=new JButton("+");
      additionbutton.setBounds(330,250,80,180);
      additionbutton.addActionListener(this);


    //
    //ThirdBloc
    //


      //Fourbutton
       fourbutton=new JButton("4");
      fourbutton.setBounds(30,350,80,80);
      fourbutton.addActionListener(this);

      //FiveButton
       fivebutton=new JButton("5");
      fivebutton.setBounds(130,350,80,80);
      fivebutton.addActionListener(this);

      //SixButton
       sixbutton=new JButton("6");
      sixbutton.setBounds(230,350,80,80);
      sixbutton.addActionListener(this);

    
    //
    //FourthBloc
    //


      //OneButton
       onebutton=new JButton("1");
      onebutton.setBounds(30,450,80,80);
      onebutton.addActionListener(this);

      //TwoButton
       twobutton=new JButton("2");
      twobutton.setBounds(130,450,80,80);
      twobutton.addActionListener(this);

      //ThreeButton
       threebutton=new JButton("3");
      threebutton.setBounds(230,450,80,80);
      threebutton.addActionListener(this);

      //EnterButton
       enterbutton=new JButton("=");
      enterbutton.setBounds(330,450,80,180);
      enterbutton.addActionListener(this);


    //
    //FivthBloc
    //


      //ZeroButton
       zerobutton=new JButton("0");
      zerobutton.setBounds(30,550,180,80);
      zerobutton.addActionListener(this);

      //decimalbutton
       decimalbutton=new JButton(".");
      decimalbutton.setBounds(230,550,80,80);
      decimalbutton.addActionListener(this);





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
    if (e.getSource()==clrbutton){
      displayLabel.setText("");
    }else   if (e.getSource()==divisionbutton){
      displayLabel.setText(displayLabel.getText()+"/");
    }else   if (e.getSource()==multiplybutton){
      displayLabel.setText(displayLabel.getText()+"X");
    }else   if (e.getSource()==subtractionbutton){
      displayLabel.setText(displayLabel.getText()+"-");
    }else   if (e.getSource()==additionbutton){
      displayLabel.setText(displayLabel.getText()+"+");
    }else   if (e.getSource()==enterbutton){
      displayLabel.setText(displayLabel.getText()+"");
    }else   if (e.getSource()==sevenbutton){
      displayLabel.setText(displayLabel.getText()+"7");
    }else   if (e.getSource()==eightbutton){
      displayLabel.setText(displayLabel.getText()+"8");
    }else   if (e.getSource()==ninebutton){
      displayLabel.setText(displayLabel.getText()+"9");
    }else   if (e.getSource()==fourbutton){
      displayLabel.setText(displayLabel.getText()+"4");
    }else   if (e.getSource()==fivebutton){
      displayLabel.setText(displayLabel.getText()+"5");
    }else   if (e.getSource()==sixbutton){
      displayLabel.setText(displayLabel.getText()+"6");
    }else   if (e.getSource()==onebutton){
      displayLabel.setText(displayLabel.getText()+"1");
    }else   if (e.getSource()==twobutton){
      displayLabel.setText(displayLabel.getText()+"2");
    }else   if (e.getSource()==threebutton){
      displayLabel.setText(displayLabel.getText()+"3");
    }else   if (e.getSource()==zerobutton){
      displayLabel.setText(displayLabel.getText()+"0");
    }else   if (e.getSource()==decimalbutton){
      displayLabel.setText(displayLabel.getText()+".");
    }
    
  }

  
  

 
}
