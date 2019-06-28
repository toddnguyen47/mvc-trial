package main.c_controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.a_model.UserModel;
import main.b_view.ListUsersView;
import main.pojoDb.PseudoDatabase;


public class AddUsersController extends BaseController {
    private UserModel mUserModel;
    
    /**
     * Handle the submit button.
     * @author i1A771792
     *
     */
    private class BtnSubmitHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            // Make a new user
            
            // Go back to the ListUsersView
            TransitionToView(new ListUsersView());
        }
    }

    private BtnSubmitHandler _btnSubmitHandler = new BtnSubmitHandler();
    public BtnSubmitHandler getBtnSubmitHandler() {return this._btnSubmitHandler;}


    private void setUserModel() {
    }
}
