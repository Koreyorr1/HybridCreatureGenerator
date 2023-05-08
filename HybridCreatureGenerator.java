import javax.swing.*;

public class HybridCreatureGenerator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Hybrid Creature Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HybridCreatureGeneratorForm form = new HybridCreatureGeneratorForm();
        frame.setContentPane(form.createContentPane());

        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window on the screen
        frame.setVisible(true);
    }
}
