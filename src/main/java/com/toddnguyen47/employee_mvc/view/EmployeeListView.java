package com.toddnguyen47.employee_mvc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.toddnguyen47.employee_mvc.controller.EmployeeListController;
import com.toddnguyen47.employee_mvc.model.Employee;

public class EmployeeListView extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private EmployeeListController employeeListController_;

  private JPanel panelMain_;
  private List<Employee> listOfEmployees_;
  private List<String> employeeAttributes_;

  public EmployeeListView() {
    employeeListController_ = new EmployeeListController();
    employeeListController_.setEmployeeListView(this);

    panelMain_ = new JPanel();
    listOfEmployees_ = employeeListController_.getListOfEmployees();
    employeeAttributes_ = employeeListController_.getListOfAttributes();
  }

  public void execute() {
    this.initFrame();
    this.addEmployeeList();

    this.setVisible(true);
  }

  private void initFrame() {
    this.setTitle("Employee List View");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800, 600);
    this.setLayout(new FlowLayout());
  }

  private void addEmployeeList() {
    BorderLayout borderLayout = new BorderLayout();
    panelMain_.setLayout(borderLayout);

    this.addPageStartPanel();
    this.addPageEndPanel();

    this.add(panelMain_);
  }

  private void addPageStartPanel() {
    JPanel gridPanel = new JPanel();
    GridLayout gridLayout = new GridLayout();
    // Add 1 for the header
    gridLayout.setRows(listOfEmployees_.size() + 1);
    gridLayout.setColumns(employeeAttributes_.size());
    gridPanel.setLayout(gridLayout);

    this.addHeaders(gridPanel);
    this.addEmployees(gridPanel);

    panelMain_.add(gridPanel, BorderLayout.PAGE_START);
  }

  private void addHeaders(JPanel gridPanel) {
    JTextArea lastTextArea = new JTextArea();
    for (String attribute : employeeAttributes_) {
      JTextArea textArea = this.getNoneditableTextArea();
      textArea.setText(attribute);
      textArea.setBackground(Color.CYAN);
      textArea.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, Color.BLACK));
      gridPanel.add(textArea);
      lastTextArea = textArea;
    }
    lastTextArea.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
  }

  private void addEmployees(JPanel gridPanel) {
    for (Employee e : listOfEmployees_) {
      JTextArea textAreaId = this.getNoneditableTextArea();
      JTextArea textAreaName = this.getNoneditableTextArea();
      JTextArea textAreaJobTitle = this.getNoneditableTextArea();
      textAreaId.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
      textAreaName.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 0, Color.BLACK));
      textAreaJobTitle.setBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, Color.BLACK));

      textAreaId.setText(Integer.toString(e.getId()));
      textAreaName.setText(e.getName());
      textAreaJobTitle.setText(e.getJobTitle());

      gridPanel.add(textAreaId);
      gridPanel.add(textAreaName);
      gridPanel.add(textAreaJobTitle);
    }
  }

  private void addPageEndPanel() {
    JButton buttonAddUser = this.getButtonAddUser();
    JButton buttonDeleteUser = new JButton("Delete Employee");

    JPanel pageEndPanel = new JPanel();
    pageEndPanel.add(buttonAddUser);
    pageEndPanel.add(buttonDeleteUser);

    panelMain_.add(pageEndPanel, BorderLayout.PAGE_END);
  }

  private JButton getButtonAddUser() {
    JButton buttonAddUser = new JButton("Add Employee");
    buttonAddUser.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("Bruh");
      }
    });

    return buttonAddUser;
  }

  private JTextArea getNoneditableTextArea() {
    JTextArea textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.addMouseListener(new MouseListener() {
      @Override
      public void mouseReleased(MouseEvent e) {
      }

      @Override
      public void mousePressed(MouseEvent e) {
        textArea.selectAll();
      }

      @Override
      public void mouseExited(MouseEvent e) {
      }

      @Override
      public void mouseEntered(MouseEvent e) {
      }

      @Override
      public void mouseClicked(MouseEvent e) {
      }
    });
    return textArea;
  }
}
