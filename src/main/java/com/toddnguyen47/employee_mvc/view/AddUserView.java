package com.toddnguyen47.employee_mvc.view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class AddUserView extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public AddUserView() {
    this.initFrame();

    this.setVisible(true);
  }

  private void initFrame() {
    this.setLayout(new FlowLayout());
    this.setSize(640, 480);
    this.setTitle("Add User");
  }
}
