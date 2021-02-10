package GUI;

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
            System.out.println("adding to "+player.getName()+"'s cards.");
            player.addCard(null);
        });

        show(true);
        System.out.println("popup up");
    }
}
