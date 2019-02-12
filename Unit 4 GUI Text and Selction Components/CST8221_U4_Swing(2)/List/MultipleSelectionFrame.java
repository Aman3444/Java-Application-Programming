// Chapter 12:  MultipleSelectionFrame.java
// Copying items from one List to another.
//Modified by Sv. Ranev
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import java.util.List;


public class MultipleSelectionFrame extends JFrame 
{
  
	private static final long serialVersionUID = 212559430513715244L;
	//In Java 6 the two lines below will not compile
   //The should be replaced by the two commented lines:
   //private JList  copyJList; // list to copy color names into
   //private JList  colorJList; // list to hold color names
   //Java 7 - generic lists
    private JList <String>copyJList; // list to hold color names
    private JList <String> colorJList; // list to hold color names
       
   private JButton copyJButton; // button to copy selected names
   private static final String[] colorNames = { "Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow" };

   // MultipleSelectionFrame constructor
   public MultipleSelectionFrame()
   {
      super( "Multiple Selection Lists" );
      setLayout( new FlowLayout() ); // set frame layout
      //In Java 6 the line below should be
      //colorJList = new JList( colorNames ); // holds names of all colors
      colorJList = new JList <String>( colorNames ); // holds names of all colors
      
      colorJList.setVisibleRowCount( 5 ); // show five rows
      colorJList.setSelectionMode( 
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
      // add( colorJList ); // add list with scrollpane - all items will be displayed
      add( new JScrollPane( colorJList )); // add list with scrollpane and 5 items dysplayed

      copyJButton = new JButton( "Copy >>>" ); // create copy button
      copyJButton.addActionListener(

         new ActionListener() // anonymous inner class 
         {  
            // handle button event
            public void actionPerformed( ActionEvent event )
            {
               // place selected values in copyJList
               // In Java 6 the line below should be replaced with the following two lines	
               // copyJList.setListData(colorJList.getSelectedValues() );
               //Java 7 implementation
               List <String> selectedListValues = colorJList.getSelectedValuesList() ;
               copyJList.setListData(selectedListValues.toArray(new String[0]));
            	 
            } // end method actionPerformed 
         } // end anonymous inner class
      ); // end call to addActionListener
      add( copyJButton); // add copy button to JFrame
      //In Java 7 the line below should be
      copyJList = new JList <String>(); // create list to hold copied color names
 //     copyJList = new JList(); // create list to hold copied color names
      copyJList.setVisibleRowCount( 5 ); // show 5 rows
      copyJList.setFixedCellWidth( 100 ); // set width
      copyJList.setFixedCellHeight( 15 ); // set height
      copyJList.setSelectionMode( 
         ListSelectionModel.SINGLE_INTERVAL_SELECTION );
      add( new JScrollPane( copyJList )); // add list with scrollpane
   } // end MultipleSelectionFrame constructor
} // end class MultipleSelectionFrame


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
