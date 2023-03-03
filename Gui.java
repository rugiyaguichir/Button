import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame{


    private JPanel MainPanel;
    private JLabel cin;
    private JTextField textField;
    private JButton button;


    public Gui() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text1 = textField.getText();
                String text2 = "";
                for (int i = text1.length() / 2 ; i < text1.length(); i += 3) {
                    text2 += text1.substring(i-1,i + 1);

                }
                textField.setText(text2);
            }
        });
    }
    public static void main(String[] args) {
        Gui h = new Gui();
        h.setContentPane(h.MainPanel);
        h.setTitle("Hello");
        h.setSize(300, 200 );
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

