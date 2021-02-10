package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI {
    private int numPlayers = 0;
    private final int STARTINGYPOSITION = 50;
    private final int YDIF = 50;

    // GUI stuff
    static JFrame mainFrame;

    public GUI() {

        while (numPlayers <= 0){
            SpinnerNumberModel sModel = new SpinnerNumberModel(1, 1, 30, 1);
            JSpinner spinner = new JSpinner(sModel);

            int option = JOptionPane.showOptionDialog(null, spinner, "How many players?",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (option == JOptionPane.CANCEL_OPTION)
            {
                // user hit cancel
                JOptionPane.showMessageDialog(null, "The point of the app is to keep track of a certain number of people's tricks.");
            }
            else {
                // user entered a number
                numPlayers = (int) spinner.getValue();
            }
        }

        initialiseGUI();
    }

    private void initialiseGUI() {
        //menu
        // create a frame - based on https://www.geeksforgeeks.org/java-swing-jmenubar/
        mainFrame = new JFrame("Card Counter");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // based on https://stackoverflow.com/questions/7799940/jframe-exit-on-close-java
        mainFrame.setSize(500, 500);
        mainFrame.setLocationRelativeTo(null);

        // create a menubar
        JMenuBar mb;
        JMenu x;
        JMenuItem m1, m2, m3;

        mb = new JMenuBar();

        // create a menu
        x = new JMenu("Menu");

        // create menuitems - based on https://stackoverflow.com/questions/9778621/how-to-make-a-jmenu-item-do-something-when-its-clicked
        m1 = new JMenuItem(new AbstractAction("New Card Counter") {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI();
            }
        });
        m2 = new JMenuItem("MenuItem2");
        m3 = new JMenuItem(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // add menu items to menu
        x.add(m1);
        x.add(m2);
        x.add(m3);

        // add menu to menu bar
        mb.add(x);

        // add menubar to frame
        mainFrame.setJMenuBar(mb);

        // set the size of the frame
        mainFrame.setSize(500, 500);
        mainFrame.setVisible(true);

        //mainFrame layout
        int rows = numPlayers;
        int columns = 3;
        JPanel[][] panelHolder = new JPanel[rows][columns];
        mainFrame.setLayout(new GridLayout(rows,columns));

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                panelHolder[i][j] = new JPanel();
                mainFrame.add(panelHolder[i][j]);
            }
        }

        //other players and their cards
        for (int i = 0; i < numPlayers; i++) {
            panelHolder[i][1].add(new JLabel("Player " + (i + 1) + ":")); //todo complete using https://stackoverflow.com/questions/766956/how-do-i-create-a-right-click-context-menu-in-java-swing
        }

    }

    public static void main(String[] args) {
        new GUI();
    }
}
