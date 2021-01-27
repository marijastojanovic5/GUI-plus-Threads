package gui;

import javax.swing.JTextArea;

public class Threads extends Thread {
    private boolean ind;
    private String text="";
    private JTextArea textarea;
    public Threads(JTextArea textarea){
        this.textarea=textarea;
        ind=false;
        start();
    }
    public void stopIt(){
        ind= false;
    }
    public synchronized void goo(){
        ind = true;
        notify();
        
    }

    
    @Override
    public void run(){
        while(true){
            if(!ind){
            synchronized(this){
                try{
                    wait();
                }catch(InterruptedException ex){
                    
                    }
                }
            }System.out.println("Nit je krenula");
            text+="Krenulo je\n";
            textarea.setText(text);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
