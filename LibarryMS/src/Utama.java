
import java.awt.Image;
import java.awt.SplashScreen;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ugi Ispoyo Widodo
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
            
} catch (Exception e) {

}
          FSplash FormSplash = new FSplash();
//--End variable the contains forms
Thread ThFormSplash = new Thread(FormSplash);
//End the form container variable
ThFormSplash.start();
while(!FormSplash.isShowing()){
try{
//Display the FormSplash for 7 seconds
Thread.sleep(4000);
//Thread.sleep(100);
}catch(InterruptedException e){}
}

FormSplash.dispose();

    }
    
}