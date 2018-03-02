import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class BasicSwing extends JFrame{

    JPanel p=new JPanel();
    JButton b=new JButton("Push");
    JTextField t=new JTextField("Text",10);
    JTextArea ta=new JTextArea("How\nAre\nU?",5,20);
    JLabel l=new JLabel("HI");
    String choices[]={
            "alla",
            "balla",
            "calla"
    };
    JComboBox<String> cb=new JComboBox<>(choices);


    public static void main(String[] args){
        new BasicSwing();
    }

    public BasicSwing(){
      super("Basic Swing App");

      setSize(400,300);
      setResizable(true);

      p.add(b);
      p.add(t);
      p.add(ta);
      p.add(l);
      p.add(cb);
      add(p);

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      setVisible(true);
    }
}