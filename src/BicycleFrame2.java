import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BicycleFrame2 extends JFrame {

    Color purple = new Color(128,0,128);
    JButton smile, sad;

    public BicycleFrame2(){
        super("Bicycle Shop");
        setSize(1200,500);
        setLocation(100,200);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        ImageIcon img = new ImageIcon("bike.jfif");
        setIconImage(img.getImage());
        getContentPane().setBackground(purple);
        add(new JLabel(new ImageIcon("bike.jfif")));
        ImageIcon smileImg = new ImageIcon("smile.jfif");
        smile = new JButton(smileImg);
        smile.addActionListener(new ButtonListener());
        add(smile);
        ImageIcon sadImg = new ImageIcon("sad.jfif");
        sad = new JButton(sadImg);
        sad.addActionListener(new ButtonListener());
        add(sad);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BicycleFrame2 frame2 = new BicycleFrame2();
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==smile)
            {
                JOptionPane.showMessageDialog(null,smile.getIcon());
            }

            else
            {
                JOptionPane.showMessageDialog(null,sad.getIcon());
            }
        }
    }
}