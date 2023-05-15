
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarGameGUI {
    
    JFrame fr;
    JPanel carPanel;
    CarHandler hnd;
    int speed;
    JLabel background;
    int width;
    int height;
    
    public CarGameGUI(){
        speed = 20;
        width = 500;
        height = 700;
        initGUI();
        hnd = new CarHandler(this);
        
    }
    
    private void initGUI()
    {
        fr = new JFrame("Car Game");
        fr.setLayout(null);
        background = new JLabel("", new ImageIcon("background-image.jpg"), JLabel.CENTER);
        background.setBounds(0, 0, width, height);
        
        carPanel = new JPanel();
        carPanel.setSize(80,80);
        
        JLabel car = new JLabel(new ImageIcon("car.png"));
        carPanel.add(car);
        carPanel.setLocation(220, 440);
        
        Color carBg = Color.decode("3B3A3A");
        carPanel.setBackground(carBg);
        
        background.add(carPanel);
        fr.setSize(width,height);
        fr.setVisible(true);
        
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.addKeyListener(hnd);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
