package welcomeFrame;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.Timer;

///////////////////////////////////////////////
//some Code taken from the book
//Filthy rich clients
//by Chet Haase and Romain Guy
//
///////////////////////////////////////////////

public class FadingButton extends JButton implements ActionListener {

    float alpha = 1.0f;                 // current opacity of button
    Timer timer;                        // for later start/stop actions
    int animationDuration = 2000; 	// each animation will take 2 seconds
    long animationStartTime;            // start time for each animation
    BufferedImage buttonImage = null;
    String label;
    /** Creates a new instance of FadingButton */
    public FadingButton(String label) {
        this.label = label;
        setOpaque(false);
        timer = new Timer(30, this);
        addActionListener(this);
        doClick();
    }
 
    public void paint(Graphics g) {
        // Create an image for the button graphics if necessary
        if (buttonImage == null || buttonImage.getWidth() != getWidth() ||
                buttonImage.getHeight() != getHeight()) {
            buttonImage = getGraphicsConfiguration().
                    createCompatibleImage(getWidth(), getHeight());
        }
        Graphics gButton = buttonImage.getGraphics();
        gButton.setClip(g.getClip());
        
        //  Have the superclass render the button for us
        super.paint(gButton);
        
        // Make the graphics object sent to this paint() method translucent
	Graphics2D g2d  = (Graphics2D)g;
	AlphaComposite newComposite = 
	    AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
	g2d.setComposite(newComposite);
        
        // Copy the button's image to the destination graphics, translucently
        g2d.drawImage(buttonImage, 0, 0, null);
        
    }
    
    /**
     * This method receives both click events (which start and stop the
     * animation) and Timer events (which animate the alpha of the button).
     */
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(this)) {

            // button click
            if (!timer.isRunning()) {
                animationStartTime = System.nanoTime() / 1000000;
                this.setText(label);
                timer.start();
            } else {
                timer.stop();
                // reset alpha to opaque
                alpha = 1.0f;
               
            }
        } else {
            // timer event
            // calculate the elapsed fraction
            long currentTime = System.nanoTime() / 1000000;
            long totalTime = currentTime - animationStartTime;
            if (totalTime > animationDuration) {
                animationStartTime = currentTime;
            }
            float fraction = (float)totalTime / animationDuration;
            fraction = Math.min(1.0f, fraction);
            // This calculation will cause alpha to go from 1 to 0 and back to 1
            // as the fraction goes from 0 to 1
            alpha = Math.abs(1 - (2 * fraction));
            // redisplay our button with its new alpha value
            repaint();
        }
    }

    

}
