package welcomeFrame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


////////////////////////////////////////
//
//  http://tips4java.wordpress.com/2008/10/12/background-panel/
//
////////////////////////////////////////
public class BackgroundPanel extends JPanel {
  Image bgImage=null;
  String message="";
  
  
  public BackgroundPanel(String path) {
    try {
      getFileImage(path);
    }
    catch (Exception ex) {
      message="File load failed: "+ex.getMessage();
    }
    
    
  }
  
  public void paintComponent(Graphics g) {
    if (bgImage!=null) {
      g.drawImage(bgImage,0,0,this);
    } else {
      g.drawString(message,40,40);
    }
  }
  private void getFileImage(String filePath) throws InterruptedException, IOException {
    FileInputStream in = new FileInputStream(filePath);
    byte [] b=new byte[in.available()];
    in.read(b);
    in.close();
    bgImage=Toolkit.getDefaultToolkit().createImage(b);
    MediaTracker mt=new MediaTracker(this);
    mt.addImage(bgImage,0);
    mt.waitForAll();
  }
}