import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

  class MenuExample {
    private JFrame frame;
    private JTextArea textArea;
    private String RandomHue;

    MenuExample() {
      frame = new JFrame(title: "Menu");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(width:600, height:400);
      frame.setLayout(new BorderLayout());
