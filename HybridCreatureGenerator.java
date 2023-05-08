import javax.swing.*;

public class HybridCreatureGenerator {
	// Main method
    public static void main(String[] args) {
    	// Schedule a job for the event dispatch thread to create and show the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    // Method to create and display the GUI	
    private static void createAndShowGUI() {
    	// Create a new JFrame with the title "Hybrid Creature Generator"
        JFrame frame = new JFrame("Hybrid Creature Generator");
        
        // Set the default close operation to exit the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new instance of the HybridCreatureGeneratorForm
        HybridCreatureGeneratorForm form = new HybridCreatureGeneratorForm();
        
        // Set the content pane of the frame to the main panel of the form
        frame.setContentPane(form.createContentPane());

        // Pack the frame to set its size based on the preferred size of its content pane
        frame.pack();
        
        // Center the window on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
