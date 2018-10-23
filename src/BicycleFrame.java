import javax.swing.*;

public class BicycleFrame extends JFrame {
    public BicycleFrame(){
        super("Bicycle Shop");
        setSize(400,200);
        setLocation(100,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        BicycleFrame frame = new BicycleFrame();
    }
}
