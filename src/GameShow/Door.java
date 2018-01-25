package GameShow;

public class Door
{
    protected Goat gaot;
    protected Prize prize;

    public Door(Goat goat)
    {
       this.gaot = goat;
    }

    public Door(Prize prize)
    {
        this.prize = prize;
    }

    public Goat getGaot()
    {
        return gaot;
    }

    public void setGaot(Goat gaot)
    {
        this.gaot = gaot;
    }

    public Prize getPrize()
    {
        return prize;
    }

    public void setPrize(Prize prize)
    {
        this.prize = prize;
    }

    @Override
    public String toString()
    {
        if (prize == null)
        {
            return "Goat";
        }

        else
            {

                return "Prize";

        }

    }
}
