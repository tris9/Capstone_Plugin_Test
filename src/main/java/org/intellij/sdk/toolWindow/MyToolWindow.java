// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.toolWindow;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.ui.table.JBTable;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.Calendar;

public class MyToolWindow {

  private JPanel myToolWindowContent;
  private JButton runSlicerButton;
  private JButton stopSlicerButton;
  private JButton forwardSlicerButton;
  private JButton backwardSlicerButton;
  private JButton refreshSlicerButton;
  private JButton settingsSlicerButton;
  private JButton undoSlicerButton;
  private JComboBox comboBox1;
  private JTextField textField1;
  private JLabel runLabel;
  private JTabbedPane tracePanel;
  private JTable traceTable;
  private JPanel graphPanel;

  public MyToolWindow(ToolWindow toolWindow) {
    //hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
    //refreshToolWindowButton.addActionListener(e -> currentDateTime());

    //this.currentDateTime();

    runSlicerButton.addActionListener(e -> runSlicer());
    stopSlicerButton.addActionListener(e -> stopSlicer());
    forwardSlicerButton.addActionListener(e -> forwardSlicer());
    backwardSlicerButton.addActionListener(e -> backwardSlicer());
    refreshSlicerButton.addActionListener(e -> refreshSlicer());
    settingsSlicerButton.addActionListener(e -> settingsSlicer());
    undoSlicerButton.addActionListener(e -> undoSlicer());



  }

  public void runSlicer(){
    System.out.println("Run Slicer");
  }
  public void stopSlicer(){
    System.out.println("Stop Slicer");
  }
  public void forwardSlicer(){
    System.out.println("Forward Slicer");
  }
  public void backwardSlicer(){
    System.out.println("Backward Slicer");
  }
  public void refreshSlicer(){
    System.out.println("Refresh Slicer");
  }
  public void settingsSlicer(){
    System.out.println("Settings Slicer");
  }
  public void undoSlicer(){ System.out.println("Undo Slicer");}
  public JPanel getContent() {
    return myToolWindowContent;
  }

  private void createUIComponents() {
    // TODO: place custom component creation code here

    myToolWindowContent = new JPanel();
    myToolWindowContent.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

    runSlicerButton = new JButton();
    runSlicerButton.setIcon(AllIcons.Actions.Execute);
    runSlicerButton.setBorderPainted(true);
    //runSlicerButton.setBorder(null);
    runSlicerButton.setMargin(new Insets(0, 20, 0, 20));
    runSlicerButton.setPreferredSize(new Dimension(20, 20));
    runSlicerButton.setContentAreaFilled(false);

    stopSlicerButton = new JButton();
    stopSlicerButton.setIcon(AllIcons.Actions.Suspend);
    stopSlicerButton.setBorderPainted(true);
    //stopSlicerButton.setBorder(null);
    stopSlicerButton.setMargin(new Insets(0, 20, 0, 20));
    stopSlicerButton.setPreferredSize(new Dimension(20, 20));
    stopSlicerButton.setContentAreaFilled(false);

    backwardSlicerButton = new JButton();
    backwardSlicerButton.setIcon(AllIcons.Actions.Back);
    backwardSlicerButton.setBorderPainted(true);
    //backwardSlicerButton.setBorder(null);
    backwardSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    backwardSlicerButton.setPreferredSize(new Dimension(20, 20));
    backwardSlicerButton.setContentAreaFilled(false);

    forwardSlicerButton = new JButton();
    forwardSlicerButton.setIcon(AllIcons.Actions.Forward);
    forwardSlicerButton.setBorderPainted(true);
    //forwardSlicerButton.setBorder(null);
    forwardSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    forwardSlicerButton.setPreferredSize(new Dimension(20, 20));
    forwardSlicerButton.setContentAreaFilled(false);

    refreshSlicerButton = new JButton();
    refreshSlicerButton.setIcon(AllIcons.Actions.Refresh);
    refreshSlicerButton.setBorderPainted(true);
    //refreshSlicerButton.setBorder(null);
    refreshSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    refreshSlicerButton.setPreferredSize(new Dimension(20, 20));
    refreshSlicerButton.setContentAreaFilled(false);

    settingsSlicerButton = new JButton();
    settingsSlicerButton.setIcon(AllIcons.Actions.Properties);
    settingsSlicerButton.setBorderPainted(true);
    //settingsSlicerButton.setBorder(null);
    settingsSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    settingsSlicerButton.setPreferredSize(new Dimension(20, 20));
    settingsSlicerButton.setContentAreaFilled(false);

    undoSlicerButton = new JButton();
    undoSlicerButton.setIcon(AllIcons.Actions.Undo);
    undoSlicerButton.setBorderPainted(true);
    //undoSlicerButton.setBorder(null);
    undoSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    undoSlicerButton.setPreferredSize(new Dimension(20, 20));
    undoSlicerButton.setContentAreaFilled(false);

    traceTable = new JTable();

  }
  private void $$$setupUI$$$() {
    createUIComponents();
  }
}