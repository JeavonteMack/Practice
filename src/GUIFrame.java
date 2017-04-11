import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Jeavonte Staley
 */
public class GUIFrame extends JFrame
{
    JButton loopBtn, quitBtn;
    
    JPanel topPanel, midPanel, bottomPanel;
    JLabel mainLabel;
    
    JTextArea txtArea;
    JScrollPane sPane;
    
    Font font;
    int buttonClicked;
    
    public GUIFrame()
    {
         font = new Font("Times New Roman", Font.ITALIC,24);
         
        loopBtn = new JButton("Click Me");
        loopBtn.setFont(font);
        
        quitBtn = new JButton("Quit");
        quitBtn.setFont(font);
        
       topPanel = new JPanel();
       topPanel.setBackground(Color.LIGHT_GRAY);
         
        midPanel = new JPanel();
        midPanel.setBackground(Color.BLUE);
        
         bottomPanel = new JPanel();
         bottomPanel.setBackground(Color.GREEN);
         
        mainLabel = new JLabel("GUI ActionListener Practice");
       
        txtArea = new JTextArea(30,60);
        sPane = new JScrollPane(txtArea);
        
        
         topPanel.add(mainLabel);
         midPanel.add(sPane);
         bottomPanel.add(loopBtn);
         bottomPanel.add(quitBtn);
        
        
         add(topPanel, BorderLayout.NORTH);
         add(midPanel,BorderLayout.CENTER);
         add( bottomPanel, BorderLayout.SOUTH);
        
         listen clicked = new listen();
         loopBtn.addActionListener(clicked);
         quitBtn.addActionListener(clicked);
     
        
    }
    private class listen implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == loopBtn)
                {
                    buttonClicked++;
                    txtArea.append("Button Clicked: " +buttonClicked+" times\n");
                 }
                else if (e.getSource() == quitBtn)
                {
                    System.exit(0);
                }
            }
        }
}
