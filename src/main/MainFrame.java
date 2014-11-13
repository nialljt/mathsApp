package main;



import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import exponential.ExponentialPanelUI;

import parametric.ParametricPanelUI;
import polynomial.PolynomialPanelUI;

import trigonometric.TrigonometricPanelUI;
import welcomeFrame.WelcomeFrame;

import mainMenu.MenuPanel;


/////////////////////////////////////////////////////////////////////////////////////////////////////
//  This controlled the card layout                                                                 //
//  http://stackoverflow.com/questions/6175899/how-to-change-card-layout-panels-from-another-panel //
/////////////////////////////////////////////////////////////////////////////////////////////////////

public class MainFrame extends JFrame {

		//set up identifiers
	   public static final String MENU = "menu";
	   public static final String POLYNOMIAL = "polynomial";
	   public static final String TRIGONOMETRIC = "trigonometric";
	   public static final String EXPONENTIAL = "exponential";
	   public static final String PARAMETRIC = "parametric";

	  
	   private CardLayout cardlayout = new CardLayout();
	   private JPanel cards = new JPanel(cardlayout);
	   
	   //create the panels
	   MenuPanel menuPanel = new MenuPanel();
	   PolynomialPanelUI polyPanel = new PolynomialPanelUI();
	   TrigonometricPanelUI trigPanel = new TrigonometricPanelUI();
       ExponentialPanelUI expoPanel = new ExponentialPanelUI();
	   ParametricPanelUI paraPanel = new ParametricPanelUI();
	   
	   public MainFrame() {
		   //add panels and identifiers to card layout
	      cards.add(menuPanel, MENU);
	      menuPanel.setRegistration(this);
	      cards.add(polyPanel, POLYNOMIAL);
	      polyPanel.setRegistration(this);
	      cards.add(trigPanel, TRIGONOMETRIC);
	      trigPanel.setRegistration(this);
	      cards.add(expoPanel, EXPONENTIAL);
	      expoPanel.setRegistration(this);
	      cards.add(paraPanel, PARAMETRIC);
	      paraPanel.setRegistration(this);
	      setLayout(new BorderLayout());
	      add(cards, BorderLayout.CENTER);
	      Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension d = tk.getScreenSize();
			setBounds((d.width - 550) / 2, (d.height - 400) / 2, 550, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setTitle("Maths App CA2 Niall Traynor");
	      setVisible(true);
	   }
	   
	   //swap panels around
	   public void swapView(String key) {
	      cardlayout.show(cards, key);
	      if(menuPanel.getPath() != ""){
	      menuPanel.updateList();
	      }
	   }

	}
