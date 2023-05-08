import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HybridCreatureGeneratorForm {
    private JPanel mainPanel;
    private JTextField creature1TextField;
    private JTextField creature2TextField;
    private JButton generateButton;
    private JLabel hybridNameLabel;
    private JLabel weightLabel;
    private JLabel foodLabel;
    private JLabel statusLabel;
    private JLabel checkmarkLabel;
    private Random random;

    public HybridCreatureGeneratorForm() {
        initComponents();
    }

    private void initComponents() {
        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        checkmarkLabel = new JLabel("");
        creature1TextField = new JTextField(20);
        creature2TextField = new JTextField(20);
        generateButton = new JButton("Generate Hybrid Creature");
        hybridNameLabel = new JLabel("Hybrid Name: ");
        weightLabel = new JLabel("Weight: ");
        foodLabel = new JLabel("Eats: ");
        statusLabel = new JLabel("");
        random = new Random();

        c.gridx = 0;
        c.gridy = 0;
        mainPanel.add(new JLabel("Enter the type of the first creature:"), c);

        c.gridx = 1;
        c.gridy = 0;
        mainPanel.add(creature1TextField, c);

        c.gridx = 0;
        c.gridy = 1;
        mainPanel.add(new JLabel("Enter the type of the second creature:"), c);

        c.gridx = 1;
        c.gridy = 1;
        mainPanel.add(creature2TextField, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        mainPanel.add(generateButton, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        mainPanel.add(hybridNameLabel, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        mainPanel.add(weightLabel, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        mainPanel.add(foodLabel, c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 2;
        mainPanel.add(statusLabel, c);
        
        c.gridx = 1;
        c.gridy = 6;
        c.gridwidth = 1;
        mainPanel.add(checkmarkLabel, c);
        
        mainPanel.setPreferredSize(new Dimension(500, 300)); 


        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String creature1 = creature1TextField.getText();
                String creature2 = creature2TextField.getText();
                String hybridName = generateHybridName(creature1, creature2);
                hybridNameLabel.setText("Hybrid Name: " + hybridName);

                int weight = random.nextInt(2000) + 1;
                weightLabel.setText("Weight: " + weight + " lbs");

                String[] foodOptions = {"celery", "grass", "fish", "meat", "fruits"};
                String food = foodOptions[random.nextInt(foodOptions.length)];
                foodLabel.setText("Eats: " + food);

                statusLabel.setText("Creature generation successful!");
                checkmarkLabel.setText("\u2714");
                checkmarkLabel.setForeground(new Color(0, 128, 0));
            }
        });
    }

    public JPanel createContentPane() {
        return mainPanel;
    }

    private String generateHybridName(String creature1, String creature2) {
        int splitIndex1 = random.nextInt(creature1.length() - 1) + 1;
        int splitIndex2 = random.nextInt(creature2.length() - 1) + 1;
        String part1 = creature1.substring(0, splitIndex1);
        String part2 = creature2.substring(splitIndex2);
        return part1 + part2;
    }
}

