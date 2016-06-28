
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.border.Border;


public class FSplash extends JWindow implements Runnable{
    
    int a = 0;
    JProgressBar progressBar = new JProgressBar(0, 100);
    JLabel label = new JLabel();
    JLabel lcopy = new JLabel();
    Border border = BorderFactory.createTitledBorder("Tunggu…");
    
    @Override
    public void run(){
  try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
            
} catch (Exception e) {

}
progressBar.setStringPainted(true);
        progressBar.setBorder(border);
        label.setText("   Aplikasi LibarryMS");
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
        label.setForeground(Color.CYAN);
        
        lcopy.setText("© Copyright 2015 Developer by: Farhan, Rangga & Ugi");
        lcopy.setFont(new Font("Tahoma", Font.BOLD, 10));
        lcopy.setBounds(new Rectangle(5,210,300,50));
        this.getContentPane().add(lcopy); //untuk memasukkan ke dlm form
        
        JPanel content = (JPanel)getContentPane();
        Color warnaBorder =  Color.BLACK;
        content.setBorder(BorderFactory.createLineBorder(warnaBorder, 1));
        setLayout(null);
        add(label);
        label.setBounds(10, 10, 350, 100);
        Component add = add(progressBar);
        progressBar.setBounds(10, 130, 315, 40);
        pack();
        setSize(350, 250);
        setVisible(true);
        setLocationRelativeTo(null);
        while (a <= 100) {
            progressBar.setValue(a);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }
            a += 1;
        }
        this.dispose();
        
MenuUtama mu= new MenuUtama();
mu.setVisible(true);
}


}
