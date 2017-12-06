package Bank;

// A class to start the application
public class StartApp {
	
    public static void main(String[] args) {
        Login frame = new Login();
        frame.setVisible(true);
        frame.setBounds(0,0,260,220); // Sets the size of the JFrame
        frame.setLocationRelativeTo(null); // Positioning the JFrame (Window) at the center of the computer's screen
    }
}