package main.c_controller;

import javax.swing.JFrame;

import main.App;
import main.b_view.BaseView;

/**
 * The base controller that all class should inherit from.
 */
public abstract class BaseController {
    public void TransitionToView(BaseView view) {
        App.MAIN_FRAME.setVisible(false);
        ((JFrame) App.MAIN_FRAME).getContentPane().removeAll();

        App.MAIN_FRAME.add(view);
        App.MAIN_FRAME.repaint();
        App.MAIN_FRAME.setVisible(true);
    }
}
