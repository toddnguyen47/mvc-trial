package main.b_view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.a_model.UserModel;
import main.c_controller.ListUsersController;

/**
 * The view that lists all the users
 * 
 * @author ToddNguyen
 *
 */
public class ListUsersView extends BaseView<UserModel> {
    private JPanel mMainPanel = new JPanel();
    private JButton btnAddUser = new JButton("Add User");
    private ListUsersController controller = new ListUsersController();

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ListUsersView() {
        this.init();
    }

    /**
     * Initialize the JPanel
     */
    private void init() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        this.updateView(null);
        this.add(mMainPanel);

        btnAddUser.addActionListener(controller.getAddUserHandler());
        this.add(btnAddUser);
    }

    /**
     * Update the view with users.
     */
    public void updateView(List<UserModel> listUserModels) {
        // Set the layout to have listUserModels.size() as # of rows, 3 as # of columns,
        // then have a gap
        // of 5 vertically and horizontally
        int numRows = 0;
        if (listUserModels != null)
            numRows = listUserModels.size();

        mMainPanel.setLayout(new GridLayout(numRows, 3, 5, 5));

        mMainPanel.add(new JLabel("ID"));
        mMainPanel.add(new JLabel("Title"));
        mMainPanel.add(new JLabel("Job Description"));

        if (listUserModels != null) {
            for (UserModel um : listUserModels) {
                mMainPanel.add(new JLabel(String.valueOf(um.getId())));
                mMainPanel.add(new JLabel(um.getTitle()));
                mMainPanel.add(new JLabel(um.getJobDescription()));
            }
        }
    }
}
