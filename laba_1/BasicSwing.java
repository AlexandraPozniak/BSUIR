import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.util.ArrayList;

public class BasicSwing extends JFrame{

    JPanel panel=new JPanel();
    JButton button=new JButton("");
    JTextField text=new JTextField("Text",10);
    List<String> choices = new ArrayList<String>();
    JComboBox<String> combobox=new JComboBox<>(choices);

    public class ButtonActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            choices.add(text.getText());
            text.setText("");


        }
    }

    public static void main(String[] args){
        new BasicSwing();
    }

    public BasicSwing(){

        super("Basic Swing App");

        setSize(400,300);
        setResizable(true);

        panel.add(button);
        panel.add(text);
        panel.add(combobox);
        add(panel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

        ActionListener actionListener = new ButtonActionListener();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                choices.add(text.getText());
                text.setText("");

            }
        });
    }
}