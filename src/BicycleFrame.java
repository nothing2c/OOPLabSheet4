import javax.swing.*;

public class BicycleFrame extends JFrame {

    public BicycleFrame(){
        super("Bicycle Shop");
        setSize(400,200);
        setLocation(100,200);
        ImageIcon img = new ImageIcon("bike.jfif");
        setIconImage(img.getImage());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        BicycleFrame frame = new BicycleFrame();
    }
}
