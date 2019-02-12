// Chapter 12: KeyDemo.java
// Testing KeyDemoFrame.
// The fileKeyDemoFrame has been modified by S. Ranev
import javax.swing.JFrame;
import java.awt.EventQueue;
public class KeyDemo {
   
   public static void main( String[] args )   { 
    EventQueue.invokeLater(new Runnable(){
      public void run() {  
       KeyDemoFrame keyDemoFrame = new KeyDemoFrame(); 
       keyDemoFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       keyDemoFrame.setSize( 350, 100 ); // set frame size
       keyDemoFrame.setVisible( true ); // display frame
    }
     });
   } // end main
} // end class KeyDemo


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
