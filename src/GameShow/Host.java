package GameShow;

import GameShow.Door;
import GameShow.Goat;

import java.util.ArrayList;
import java.util.Collections;

public class Host
{
    public ArrayList<Door> set_Doors()
    {
            Goat goat1 = new Goat();
            Goat goat2 = new Goat();
            Prize prize = new Prize();

            ArrayList<Door> doors =  new ArrayList<Door>();

            doors.add(new Door(goat1));
            doors.add(new Door(goat2));
            doors.add(new Door(prize));

            Collections.shuffle(doors);

            return doors;
    }

}
