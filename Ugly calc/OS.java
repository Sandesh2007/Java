import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.io.IOException;

public class OS {
    public static void main(String[] args) {
        // label
        JLabel label = new JLabel();
        label.setSize(400, 100);
        label.setForeground(Color.WHITE);
        label.setBounds(100, 100, 400, 100);

        // Set font and size
        Font font = new Font("Arial", Font.PLAIN, 16); // Replace "Arial" with your desired font
        label.setFont(font);

        // Use HTML to format text with line breaks
        label.setText("<html>Hello, this is my first Java GUI application.<br>"
                + "Its name is The Ugly Calculator.<br>"
                + "If you want to use it, click the button below :)</html>");

        // button
        JButton button = new JButton("Use ugly calculator");
        button.setPreferredSize(new Dimension(200, 25));
        button.setFocusable(false);
        button.addActionListener(e -> {
            // Your code to execute when the button is clicked
            try {
                // Command to execute
                String command = "java /home/sandesh/Desktop/Java/Ugly calc/Temp.java";
    
                // Create ProcessBuilder
                ProcessBuilder processBuilder = new ProcessBuilder(command.split("\\s+"));
                
                // Optionally, set the working directory
                // processBuilder.directory(new File("/path/to/working/directory"));
    
                // Start the process
                Process process = processBuilder.start();
    
                // Read the output
                java.io.InputStream is = process.getInputStream();
                java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
                String output = s.hasNext() ? s.next() : "";
    
                // Wait for the command to complete
                int exitCode = process.waitFor();
    
                // Print the output and exit code
                System.out.println("Output: " + output);
                System.out.println("Exit Code: " + exitCode);
                s.close();
            } catch (IOException | InterruptedException ew) {
                ew.printStackTrace();
            }
        });

        // panel
        JPanel panel = new JPanel();
        panel.setFocusable(false);
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.darkGray);
        panel.add(button);

        JPanel panel1 = new JPanel();
        panel1.setFocusable(false);
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.darkGray);
        panel1.add(label);

        // frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout()); // Use FlowLayout for simplicity in this example
        frame.add(panel1);
        frame.add(panel);
        frame.setVisible(true);
    }
}
