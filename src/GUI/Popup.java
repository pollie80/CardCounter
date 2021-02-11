package GUI;

import Game.CardPicker;
import Game.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup extends JPopupMenu {
    private Player player;

    public Popup(Player player) {
        this.player = player;

        JMenuItem addItem = new JMenuItem("Add to " + player.getName());
        JMenuItem removeItem = new JMenuItem("Remove from " + player.getName());
        add(addItem);add(removeItem);

        addItem.addActionListener(e -> {
//            System.out.println("adding to "+player.getName()+"'s cards.");
            CardPicker cp = new CardPicker(player, GUI.getMainFrame(), true);
            System.out.println("cardpicker up");
            player.addCard(null);
        });

        show(true);
        System.out.println("popup up");
    }
}
