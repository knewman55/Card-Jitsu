package CardJitsu;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas{
    
    private JFrame frame;
    
    public static int width = 300;
    public static int height = width / 16 * 9;
    public static int scale = 3;
    
    public Window(){
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);
        
        frame = new JFrame();
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Card Jitsu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
