package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(null);

        Font myFont = new Font("Arial", Font.PLAIN, 10);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(10, 10, 100, 20);
        JTextField nameField = new JTextField(15);
        nameField.setBounds(50, 10, 100, 20);
        nameLabel.setFont(myFont);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(10, 50, 100, 20);
        JTextField ageField = new JTextField(15);
        ageField.setBounds(50, 50, 100, 20);
        ageLabel.setFont(myFont);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(10, 90, 100, 20);
        JTextField emailField = new JTextField(15);
        emailField.setBounds(50, 90, 100, 20);
        emailLabel.setFont(myFont);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("Level of familiarity with similar programs");
        levelLabel.setBounds(10, 130, 250, 20);
        levelLabel.setFont(myFont);

        JRadioButton level1 = new JRadioButton("Beginner");
        level1.setBounds(10, 160, 100, 20);
        level1.setFont(myFont);
        JRadioButton level2 = new JRadioButton("Intermediate");
        level2.setBounds(100, 160, 100, 20);
        level2.setFont(myFont);
        JRadioButton level3 = new JRadioButton("Advanced");
        level3.setBounds(190, 160, 100, 20);
        level3.setFont(myFont);
        JRadioButton level4 = new JRadioButton("Not Familiar");
        level4.setBounds(280, 160, 150, 20);
        level4.setFont(myFont);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next Page");
        nextButton.setBounds(10, 200, 100, 20);
        nextButton.setFont(myFont);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
