import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonChaser extends JFrame {

    JButton button;

    public ButtonChaser(){
        super("The Button Chaser Application");
        setSize(275, 170);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button = new JButton("Chase Me");
        button.setMnemonic('p');
        button.addActionListener(new ButtonListener());
        add(button);
        setVisible(true);
    }

    public static void main(String[] args) {
        ButtonChaser app = new ButtonChaser();
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Hello");
        }
    }
}
