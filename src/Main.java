import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 600, 600);

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی");
        title.setFont(new Font("Tahoma", Font.BOLD, 18));
        title.setBounds(10, 10, 100, 20);

        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        startButton.setBounds(10, 40, 100, 20);

        // Add components to the panel
        panel.add(title);
        panel.add(startButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
