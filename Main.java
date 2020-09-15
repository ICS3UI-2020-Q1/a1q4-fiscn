import java.util.Scanner; 

/**
 * Calculates the slope of a line 
 * @author Neil Fischer 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Scanner input for Program 
    Scanner input = new Scanner(System.in);  

    // prompt the user to type in the coordinates for the line 
    System.out.println("Please enter in the x coordinate of the first point"); 
    double X_1 = input.nextInt(); 

    System.out.println("Please enter in the y coordinate of the first point"); 
    double Y_1 = input.nextInt(); 

    System.out.println("Please enter in the x coordinate of the second point"); 
    double x_2 = input.nextInt(); 

    System.out.println("Please enter in the y coordinate of the second point"); 
    double y_2 = input.nextInt(); 

    // calculate the slope of the line 

    double slope_line = (y_2-Y_1) / (x_2-X_1);  

    // tell the user the answer 
    System.out.println("The slope of you line would be " + slope_line); 


  }
}
