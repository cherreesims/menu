import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

  class Menu {
    private JFrame frame;
    private JTextArea textArea;
    private String RandomHue;

    Menu() {
      frame = new JFrame(title: "Menu");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(width:600, height:400);
      frame.setLayout(new BorderLayout());

      JMenuBar menuBar = new JMenuBar();
      JMenu menu = new JMenu("Menu");
      menuBar.add(menu);

      JMenuItem getDateItem = new JMenuItem(""Get Date and Time");
      JMenuItem saveToFileItem = new JMenuItem("Save to log.txt");
      JMenuItem changeColorItem = new JMenuItem("Change Background Color");
      JMenuItem exitItem = new JMenuItem("Exit");

      menu.add(getDateItem);
      menu.add(saveToFileItem);
      menu.add(changeColorItem);
      menu.add(exitItem);

      initialRandomHue = getRandomGreenHue();

      getDateItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
             String dateTime = dateFormat.format(new Date());
             textArea.append(dateTime + "\n");
          }
      }};

    saveToFileItem.addActionLIstner(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          try {
            BufferedWriter writer = new BufferedWritter(new FileWriter("log.txt"));
            writer.write(textArea.getText());
            writer.close();
          } catch (IOException ex) {
            ex.printStackTrace();
          }
        });

        changColorItem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            String randomHue = getRandomGreenHue();
            frame.getContentPane().setBackground(Color.decode(randomHue));
            initialRandomHue = randomHue; 
          }
        });

        exitItem.addActionListner(new ActionListener() {
          @Override
          public void actionPerformed(Action Event e) {
            System.exit(0);
          }
        });

        textArea = new JTextArea();
        textArea = .setWrapStyleWord(true);
        textArea = .setLineWrap(true);
        textArea = .setEditable(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
}

private String getRandomGreenHue() {
  Random rand = new Random();
  return String.format("120,60,50', greenValue);
}

public static void main(String[] args) {
  SwingUtilities.invokeLater(new Runnable() {
    public void run() {
      new Menu();
    });
  }
}
            ,

      
