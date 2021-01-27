package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class GUIPanel extends JPanel{
    
    private JButton button;
    private JButton button2;
    private JButton array[];
    private JTextArea  textarea;
    private Threads nit;

    public GUIPanel(int n) {
        this.nit = nit;
        setBackground (Color.red);
        textarea= new JTextArea(20,20);
        add(textarea);
        setPreferredSize (new Dimension(600,500));
        button=new JButton("Go");
        button2=new JButton("Stop");
        
       // this.add(button);
        add(button);
        add(button2);
        button.addActionListener(new Listeners());
        button2.addActionListener(new Listeners());
        array=new JButton[n];
//        for(int i=0;i<array.length;i++){
//            array[i]=new JButton("Button"+(i+1));
//            add(array[i]);
//            array[i].addActionListener(new Listeners());
//        }
    }

    public JTextArea getTextarea() {
        return textarea;
    }

    public void setThreads(Threads nit) {
        this.nit = nit;
    }
    
    
    
    
    

private class Listeners implements ActionListener{

        @Override//preklopljena metoda iz interfejsa
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Clicking...");
            if(((JButton)e.getSource()) == button ){
                System.out.println("Button 1 is clicked.");
                nit.goo();
            }
            if(((JButton)e.getSource()) == button2 ){
                System.out.println("Button 2 is clicked.");
                nit.stopIt();
            }
            for(JButton button:array){
                if(((JButton)e.getSource()) == button ){
                    System.out.println("Clicked on button "+button.getText());
                }
              
            }
        }
    
    
}
}
