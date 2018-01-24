package GameShow;

import GameShow.Door;

import javax.swing.*;
import java.util.ArrayList;

public class Game
{


    public void main(String[] args)
    {
        int choice;
        ArrayList<Door> doors = new ArrayList<>();
        Host host = new Host();

        doors = host.set_Doors();

        String input = JOptionPane.showInputDialog("Which Door would you like to chose?\n" + "You have the option of "+
                                                    " 1, 2, or 3.");

                    choice = Integer.parseInt(input);



    }
}
