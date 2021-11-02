// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package org.intellij.sdk.toolWindow;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyToolWindow {

  private JLabel currentDate;
  private JLabel currentTime;
  private JLabel timeZone;
  private JPanel myToolWindowContent;

  private JButton runSlicerButton;
  private JButton stopSlicerButton;
  private JButton forwardSlicerButton;
  private JButton backwardSlicerButton;
  private JButton refreshSlicerButton;
  private JComboBox comboBox1;
  private JTextField textField1;

  public MyToolWindow(ToolWindow toolWindow) {
    //hideToolWindowButton.addActionListener(e -> toolWindow.hide(null));
    //refreshToolWindowButton.addActionListener(e -> currentDateTime());

    //this.currentDateTime();

    runSlicerButton.addActionListener(e -> runSlicer());
    stopSlicerButton.addActionListener(e -> stopSlicer());
    forwardSlicerButton.addActionListener(e -> forwardSlicer());
    backwardSlicerButton.addActionListener(e -> backwardSlicer());
    refreshSlicerButton.addActionListener(e -> refreshSlicer());
  }

  public void currentDateTime() {
    // Get current date and time
    Calendar instance = Calendar.getInstance();
    currentDate.setText(
            instance.get(Calendar.DAY_OF_MONTH) + "/"
                    + (instance.get(Calendar.MONTH) + 1) + "/"
                    + instance.get(Calendar.YEAR)
    );
    //currentDate.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Calendar-icon.png")));
    int min = instance.get(Calendar.MINUTE);
    String strMin = min < 10 ? "0" + min : String.valueOf(min);
    currentTime.setText(instance.get(Calendar.HOUR_OF_DAY) + ":" + strMin);
    //currentTime.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Time-icon.png")));
    // Get time zone
    long gmt_Offset = instance.get(Calendar.ZONE_OFFSET); // offset from GMT in milliseconds
    String str_gmt_Offset = String.valueOf(gmt_Offset / 3600000);
    str_gmt_Offset = (gmt_Offset > 0) ? "GMT + " + str_gmt_Offset : "GMT - " + str_gmt_Offset;
    timeZone.setText(str_gmt_Offset);
    //timeZone.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Time-zone-icon.png")));
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
  public JPanel getContent() {
    return myToolWindowContent;
  }

  private void createUIComponents() {
    // TODO: place custom component creation code here
    runSlicerButton = new JButton();
    runSlicerButton.setIcon(new ImageIcon("/home/tristen/Desktop/School_Docs/Year4/CPEN491/Project/Capstone_Plugin_Test/src/main/java/org/intellij/sdk/toolWindow/run-icon.png"));
    runSlicerButton.setBorderPainted(false);
    runSlicerButton.setBorder(null);
    runSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    runSlicerButton.setContentAreaFilled(false);

    stopSlicerButton = new JButton();
    stopSlicerButton.setIcon(new ImageIcon("/home/tristen/Desktop/School_Docs/Year4/CPEN491/Project/Capstone_Plugin_Test/src/main/java/org/intellij/sdk/toolWindow/stop-icon.png"));
    stopSlicerButton.setBorderPainted(false);
    stopSlicerButton.setBorder(null);
    stopSlicerButton.setMargin(new Insets(0, 0, 0, 0));
    stopSlicerButton.setContentAreaFilled(false);
  }
  private void $$$setupUI$$$() {
    createUIComponents();
  }
}