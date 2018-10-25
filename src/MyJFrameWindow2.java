import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyJFrameWindow2 extends JFrame {
    public MyJFrameWindow2(){
        super("My Own JFrame");
        setSize(300,200);
        addWindowListener(new WindowEventHandler());
        setVisible(true);
    }

    public static void main(String[] args) {
        MyJFrameWindow2 win = new MyJFrameWindow2();
    }

    class WindowEventHandler extends WindowAdapter{
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
