package mainMenu;

///////////////////////////////////////////////
// some Code taken from the book
// Filthy rich clients
// by Chet Haase and Romain Guy
// 
///////////////////////////////////////////////


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.border.Border;

public class RoundButton extends JButton {
	  public RoundButton(String label, int width, int height) {
	    super(label);

	// These statements enlarge the button so that it 
	// becomes a circle rather than an oval.
	    setPreferredSize(new Dimension(width, height));

	// This call causes the JButton not to paint 
	   // the background.
	// This allows us to paint a round background.
	    setContentAreaFilled(false);
	  }

	// Paint the round background and label.
	  protected void paintComponent(Graphics g) {
	   
		  //cast g to a graphics 2d object 
		  Graphics2D g2d = (Graphics2D) g;
		  if (getModel().isArmed()) {
	// You might want to make the highlight color 
	   // a property of the RoundButton class.
	      g2d.setColor(Color.lightGray);
	    } else {
	      g2d.setColor(getBackground());
	    }
	    g2d.fillOval(0, 0, getSize().width-1, 
	      getSize().height-1);

	    //turn on antialiasing to smooth the round buttons
	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	// This call will paint the label and the 
	   // focus rectangle.
	    
	    super.paintComponent(g);
	  }

	// Paint the border of the button using a simple stroke.
	  protected void paintBorder(Graphics g) {
	    g.setColor(getForeground());
	    g.drawOval(0, 0, getSize().width-1, 
	      getSize().height-1);
	    
	  }

	// Hit detection.
	  Shape shape;
	  public boolean contains(int x, int y) {
	// If the button has changed size, 
	   // make a new shape object.
	    if (shape == null || 
	      !shape.getBounds().equals(getBounds())) {
	      shape = new Ellipse2D.Float(0, 0, 
	        getWidth(), getHeight());
	    }
	    return shape.contains(x, y);
	  }
}
