package gui;
import javax.swing.JFrame;
public class GUI {

    public static void main(String[] args) {
        JFrame frame =new JFrame("GUINiti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUIPanel panel=new GUIPanel(5);//izveden iz JPanel classe
        Threads nit = new Threads(panel.getTextarea());
        panel.setThreads(nit);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
