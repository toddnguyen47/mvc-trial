package com.toddnguyen47.employee_mvc.view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AddUserView extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private JLabel labelId_;
  private JLabel labelName_;
  private JLabel labelJobTitle_;

  private JTextArea textAreaId_;
  private JTextArea textAreaName_;
  private JTextArea textAreaJobTitle_;

  public AddUserView() {
    this.initFrame();
    this.addPanels();

    this.setVisible(true);
  }

  private void initFrame() {
    this.setLayout(new BorderLayout());
    this.setSize(640, 480);
    this.setTitle("Add User");
  }

  private void addPanels() {
    this.addCenterPanel();
  }

  private void addCenterPanel() {
    JPanel gridbagPanel = new JPanel();
    GridBagLayout gridBagLayout = new GridBagLayout();

    gridbagPanel.setLayout(gridBagLayout);

    labelId_ = new JLabel("ID");
    textAreaId_ = new JTextArea();
    this.addLabelTextAreaToGridBag(gridbagPanel, 0, 0, labelId_, textAreaId_);

    labelName_ = new JLabel("Name");
    textAreaName_ = new JTextArea();
    this.addLabelTextAreaToGridBag(gridbagPanel, 1, 0, labelName_, textAreaName_);

    labelJobTitle_ = new JLabel("Job Title");
    textAreaJobTitle_ = new JTextArea();
    this.addLabelTextAreaToGridBag(gridbagPanel, 2, 0, labelJobTitle_, textAreaJobTitle_);

    this.add(gridbagPanel, BorderLayout.PAGE_START);
  }

  private void addLabelTextAreaToGridBag(JPanel gridbagPanel, int rowIndex, int colIndex,
      JLabel label, JTextArea textArea) {
    int iPadY = 10;

    GridBagConstraints col1Constraints = new GridBagConstraints();
    col1Constraints.anchor = GridBagConstraints.LINE_END;
    col1Constraints.weightx = 0.3;
    col1Constraints.weighty = 1.0;
    col1Constraints.ipadx = 10;
    col1Constraints.ipady = iPadY;
    col1Constraints.gridx = colIndex;

    GridBagConstraints col2Constraints = new GridBagConstraints();
    col2Constraints.anchor = GridBagConstraints.LINE_START;
    col2Constraints.weightx = 0.7;
    col2Constraints.weighty = 1.0;
    col2Constraints.fill = GridBagConstraints.HORIZONTAL;
    col2Constraints.ipady = iPadY;
    col2Constraints.gridy = rowIndex;
    col2Constraints.gridx = colIndex + 1;

    gridbagPanel.add(label, col1Constraints);
    gridbagPanel.add(new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), col2Constraints);
  }
}
