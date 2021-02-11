package Game;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardPicker extends JDialog{
    private JComboBox symbolComboBox;
    private JComboBox numberComboBox;
    private JButton OKButton;
    private JButton cancelButton;
    private JPanel mainPanel;
    private boolean forAdding;

    public CardPicker(Player player, JFrame parent, boolean forAdding) {
        super(parent, true);
        this.forAdding = forAdding;

        OKButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(symbolComboBox.getSelectedItem() + ", " + numberComboBox.getSelectedItem() + " to " + player.getName());
                Card selectedCard = new Card(Card.Symbol.valueOf(symbolComboBox.getSelectedItem().toString()), Card.Number.valueOf(numberComboBox.getSelectedItem().toString()));

                if (forAdding)
                    player.addCard(selectedCard);
                else
                    player.removeCard(selectedCard);

                dispose();
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });

        add(mainPanel);
        setTitle("Card Picker");
        setSize(250, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }



    private void createUIComponents() {
        // TODO: place custom component creation code here
        symbolComboBox = new JComboBox();
        numberComboBox = new JComboBox();
        for (Card.Symbol s :
                Card.Symbol.values()) {
            symbolComboBox.addItem(s.toString());
        }
        for (Card.Number n:
             Card.Number.values()) {
            numberComboBox.addItem(n.toString());
        }
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
