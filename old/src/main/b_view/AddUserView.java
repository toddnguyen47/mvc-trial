package main.b_view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.a_model.UserModel;
import main.c_controller.AddUsersController;

public class AddUserView extends BaseView<UserModel> {

    /**
     * 
     */
    private static final long serialVersionUID = -6193010650581386241L;

    private JPanel mMainPanel = new JPanel();
    
    private AddUsersController controller = new AddUsersController();

    private JLabel lblId = new JLabel("ID");
    private JLabel lblTitle = new JLabel("Title");
    private JLabel lblJobDesc = new JLabel("Job Description");

    private JTextField txtfldId = new JTextField(20);
    private JTextField txtfldTitle = new JTextField(20);
    private JTextField txtfldJobDesc = new JTextField(20);

    private JButton bttnSubmit = new JButton("Submit");

    public AddUserView() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        init();
        
        bttnSubmit.addActionListener(controller.getBtnSubmitHandler());
        this.add(bttnSubmit);
    }

    /**
     * Initialize the components
     */
    private void init() {
        mMainPanel.setLayout(new GridLayout(3, 2, 5, 5));

        mMainPanel.add(lblId);
        mMainPanel.add(txtfldId);

        mMainPanel.add(lblTitle);
        mMainPanel.add(txtfldTitle);

        mMainPanel.add(lblJobDesc);
        mMainPanel.add(txtfldJobDesc);

        this.add(mMainPanel);
    }
}
