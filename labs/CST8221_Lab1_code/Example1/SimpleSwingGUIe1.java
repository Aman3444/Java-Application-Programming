/* CST8221-JAP: LAB 01, Example 1
   File name: SimpleSwingGUIe1.java
*/   
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font; 
/**
 Simple Java GUI (Swing) Example.
 The example illustrates the basic steps of building a GUI.
 The application class serves as a GUI builder and an event handler - controller.
 @author Svillen Ranev
 @version 1.18.1
 @since Java 2
*/ 
public class SimpleSwingGUIe1 extends WindowAdapter implements ActionListener {
    /** Primary container (window). */
    private JFrame frame;
    /** Button component. */
    private JButton button;
    /** Label component. */
    private JLabel label;
    /** Non-primary container for button and label components. */
    private JPanel pane;
    /** Label component text. */  
    private final String LABEL_TEXT = "Number of happy button clicks: ";
    /** Click counter. */  
    private int clickCounter;

    /** Default constructor. Set the GUI and makes it visible */
    public SimpleSwingGUIe1(){
     setAndLaunch();
    }

/**
   Sets the GUI and makes it visible.
   This method is called from within the constructor to initialize the GUI.
*/
    private void setAndLaunch() {
	/* Select and create a primary container. */
	frame = new JFrame("Simple Swing GUI - E1");
	
        /* Select, create and set GUI components and their properties.*/
        //Create a button component and sets its properties.
        button = new JButton("A Happy New Semester JButton");
        // Create a keyboard shortcut(mnemonic): Pressing ALT-I will act as a mouse click on the button.	
	button.setMnemonic('i');
	// Create a Tool Tip. Will show up when the mouse hovers over the button.
	button.setToolTipText("Please Click Me");
        // Register an event handler to handle the events generated by the user actions affecting the button(for example, mouse click */
        // The application class serves as an event handler - that is why this reference is used.
        button.addActionListener(this);
        //Create a label component and sets its properties
        label = new JLabel(LABEL_TEXT + "0");
	//Change some basic properties of the component
	//Change the background color property
//	label.setBackground(Color.RED);
	//Change the foreground color property
//	label.setForeground(Color.WHITE);
	//Change the transparency property
//	label.setOpaque(true);
	// Change font property
//	label.setFont(new Font(Font.SERIF,Font.ITALIC | Font.BOLD,20));
//	label.setFont(new Font(Font.SERIF,Font.ITALIC + Font.BOLD,20));
	//Create a non-primary container and set its properties
        pane = new JPanel();
	// set a border around the JPanel
	pane.setBorder(BorderFactory.createEmptyBorder(25, 25, 10, 25));
	
        /* Arrange the GUI components inside the non-primary container.*/
        // change the default Layout Manager
	// use GridLayout with 2 rows and 1 column
	pane.setLayout(new GridLayout(2, 1));
	// Add components to JPanel container.
	pane.add(button);
	pane.add(label);
        
        
        
        /* Arrange the components and the containers inside the primary container. */
	// Install JPanel as a content pane
	// There are three different alternative ways to do that:

	// Alternative 1: works but not recomended
	// If you use this alternative you should make sure that the repacment container is opaque (for example JPanel)
	// Use the setContentPane() method of the JFrame class
	
//     frame.setContentPane(pane);

       // Alternative 2: (recomended)
       // Get the Content Pane of the JFrame class and add the component to it
       Container contentPane = frame.getContentPane();
       contentPane.add(pane);
 
        // Alternative 3: Works since Java 5. Actually it uses Alternative 2
//      frame.add(pane);   
	//add the event handler to the frame
	frame.addWindowListener(this);
        // Size the frame to the preferred size of its components
        // As a result the frame title will be truncated.
	frame.pack();
	// Make the frame not re-sizable. It is re-sizable by default.
	frame.setResizable(false);
	//Let the operating system decide where to place the window on the screen
	frame.setLocationByPlatform(true);  
	// The frame is ready. Make it visible on the screen.
	// The location of the frame on the screen will by determined by the operating system
	frame.setVisible(true);
   }
   /* Handle the events generated by the user actions */   
    /**
     * Handles the frame closing event
     * Set up the Close button (X) of the frame.
     * You should use this method only if you need
     * to free resources or close connections or files before the application closes.
     * Override the windowClosing() method of Window Adapter
     * @param e window event supplied by the runtime
     */
    @Override
    public void windowClosing(WindowEvent e) {
		//Releases all of the native screen resources used by this frame (Window)
		//Check if all user documents have been saved
                frame.dispose();
		//terminate the application and the Java VM
		System.exit(0);
    }
   
    /**
     * Handle the button clicks.
     * Overrides and implements the actionPerformed() method of the Action Listener interface.
     * @param e action event supplied by the runtime
     */
    @Override
    public void actionPerformed(ActionEvent e) {
	   // Check which button was clicked and process the event
	   Object eventSource = e.getSource();
	   if (eventSource == button){
	     clickCounter++;
	     label.setText(LABEL_TEXT + clickCounter);
	   } else {/*check for another component*/}
    }
/** 
  The main method.The GUI will have the default Look and Feel - Metal Look and Feel 
  @param args not used
*/
   public static void main(String[] args) {      
        new SimpleSwingGUIe1();
    }
}
