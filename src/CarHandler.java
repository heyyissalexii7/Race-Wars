
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class CarHandler implements KeyListener{
    CarGameGUI g;

    public CarHandler(CarGameGUI ref) 
    {
        
            this.g = ref;
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //System.out.println("Key Pressed code \t" + code);
        
        if (code == 37)
        {
            System.out.println("left key pressed");
            
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            System.out.println(x + "," + y);
            
            if (x-g.speed >= 0) 
            {
             
                 g.carPanel.setLocation(x-g.speed, y);
                
            }
            
         
        }
        
        else if (code ==39)
        {
            System.out.println("right key pressed");
            
            int x = g.carPanel.getX();
            int y = g.carPanel.getY();
            System.out.println(x + "," + y);
            
            int width = g.fr.getWidth();
            int carWidth = g.carPanel.getWidth();
            
            if (x+ g.speed + carWidth <= width) 
            {
                 g.carPanel.setLocation(x+g.speed, y);
            }
           
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
