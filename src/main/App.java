package main;

import java.awt.Frame;

import javax.swing.SwingUtilities;

import main.b_view.ListUsersView;

public class App {
    public static final Frame MAIN_FRAME = new MainFrame();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App.MAIN_FRAME.add(new ListUsersView());
                App.MAIN_FRAME.setVisible(true);
            }
        });
    }
}
