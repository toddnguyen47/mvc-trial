package main;

import javax.swing.JFrame;

/**
 * The Main Frame that our views will be displayed on.
 * @author ToddNguyen
 *
 */
public class MainFrame extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public MainFrame() {
        this.setSize(800, 600);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Main Window");
        
        // Center the window
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }
}
