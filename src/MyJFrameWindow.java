import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyJFrameWindow extends JFrame {
    public MyJFrameWindow(){
        super("My Own JFrame");
        setSize(300,200);
        addWindowListener(new WindowEventHandler());
        setVisible(true);
    }

    public static void main(String[] args) {
        MyJFrameWindow win = new MyJFrameWindow();
    }

    private class WindowEventHandler extends WindowAdapter{
        public void windowClosing(WindowEvent e) {
            int choice;

            choice=JOptionPane.showConfirmDialog(null,"Are you sure you want to close the application");
            if(choice==JOptionPane.YES_OPTION)
                System.exit(0);
            else
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }

        public void windowDeiconified(WindowEvent e){
            JOptionPane.showMessageDialog(null,"Restoring the Window");
        }

        public void windowIconified(WindowEvent e){
            JOptionPane.showMessageDialog(null,"Minimizing The Window");
        }
    }
}
