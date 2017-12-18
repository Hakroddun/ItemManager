package User.entities;

/**
 * Created by gideon on 7/28/2017.
 */
public class Item
{
    private int ID;
    private String Name;
    private double Quantity;
    private double Price;
    private int Group;

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public double getQuantity()
    {
        return Quantity;
    }

    public void setQuantity(double quantity)
    {
        Quantity = quantity;
    }

    public double getPrice()
    {
        return Price;
    }

    public void setPrice(double price)
    {
        Price = price;
    }

    public int getGroup()
    {
        return Group;
    }

    public void setGroup(int group)
    {
        Group = group;
    }
}
