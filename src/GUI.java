import javax.swing.*;

public class GUI {
    private int numPlayers = 0;

    public GUI() {

        while (numPlayers == 0){
            SpinnerNumberModel sModel = new SpinnerNumberModel(1, 1, 30, 1);
            JSpinner spinner = new JSpinner(sModel);

            int option = JOptionPane.showOptionDialog(null, spinner, "How many players?",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (option == JOptionPane.CANCEL_OPTION)
            {
                // user hit cancel
                JOptionPane.showMessageDialog(null, "The point of the app is to keep track of a certain number of people's tricks. Pls cooperate");
            }
            // user entered a number
            numPlayers = (int) spinner.getValue();
        }

        initialiseGUI();
    }

    private void initialiseGUI() {
        //menu

        //other players and their cards
    }

    public static void main(String[] args) {
        new GUI();
    }
}
