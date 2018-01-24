package GameShow;

import GameShow.Door;

import javax.swing.*;
import java.util.ArrayList;

public class Game
{


    public void main(String[] args)
    {
        int choice;
        int choice2;
        ArrayList<Door> doors = new ArrayList<>();
        Host host = new Host();

        doors = host.set_Doors();

        String input = JOptionPane.showInputDialog("Which Door would you like to chose?\n" + "You have the option of "+
                                                    " 1, 2, or 3.");

                    choice = Integer.parseInt(input);


        int reveal = host.check_doors(choice, doors);

        Door goat = doors.get(reveal);

        doors.remove(reveal);

        reveal = reveal + 1;

        input = JOptionPane.showInputDialog("As it just so happens I will reveal the contents of Door #" + reveal +
                                             "\n" + goat + "\n" + "Well what do you know. Looks like you have " +
                                            " 2 options left, door number 1 or door number 2." + "Will you change" +
                                            " your guess, or keep it?");

        choice2 = Integer.parseInt(input);

        if (choice != choice2)
        {
            choice = choice2;
        }


    }
}
