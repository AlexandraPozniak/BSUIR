import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BasicSwing extends JFrame {

    JTextField textField;
    JComboBox<String> comboBox;
    JButton button;

    public BasicSwing() {
        comboBox = new JComboBox<String>();
        textField = new JTextField(" ", 20);
        textField.setEditable(true);
        button = new JButton("Push");
        button.addActionListener(new action());
        add(textField);
        add(comboBox);
        add(button);

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }

    public class action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolean exists = false;
            for (int index = 0; index < comboBox.getItemCount() && !exists; index++){
                if (textField.getText().equals(comboBox.getItemAt(index))){
                    JOptionPane.showMessageDialog(null,"alert", "alert", JOptionPane.ERROR_MESSAGE);
                    exists = true;
                }
            }
            if (!exists) {
                comboBox.addItem(textField.getText());
            }

        }
    }

    public static void main(String[] args) {
        BasicSwing test = new BasicSwing();
    }
}

