import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
 
public class PianoKeyboard {
 
    public static void main(String[] args) {
       
 
        JFrame frame = new JFrame("Piano");
          frame.setVisible(true);
          frame.setSize(200, 200 );
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
         
        JPanel panel = new JPanel();
          frame.add(panel);
          // C KEY
        JButton button = new JButton("C");
            panel.add(button);
            button.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                   
                  System.out.println("You pressed C key");
                   
                }
            });
           
            //  D key
           
            JButton button2 = new JButton("D");
            panel.add(button2);
            button2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                   
                   System.out.println("Yout pressed the D key");
                   
                }
            });
       
                //  E key
           
            JButton button3 = new JButton("E");
            panel.add(button3);
            button3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                   
                   System.out.println("Yout pressed the E key");
                   
                }
            });
           
                    //  E key
           
            JButton button4 = new JButton("F");
            panel.add(button4);
            button4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent arg0)
                {
                   
                   System.out.println("Yout pressed the F key");
                   
                }
            });
       
           
           
       
       
       
 
    }
 
}