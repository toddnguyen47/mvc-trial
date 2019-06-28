package main.c_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.b_view.AddUserView;

public class ListUsersController extends BaseController {
    private class AddUsersHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Go to the Add User View
            TransitionToView(new AddUserView());
        }
    }

    private AddUsersHandler _addUserHandler = new AddUsersHandler();

    public AddUsersHandler getAddUserHandler() {
        return _addUserHandler;
    }
}
