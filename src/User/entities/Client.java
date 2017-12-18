package User.entities;

import java.util.Calendar;

public class Client
{
    private int ID;
    private String FirstName;
    private String LastName;
    private String Address;
    private String PhoneNumber;
    private Calendar DateAdded;

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String firstName)
    {
        FirstName = firstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String lastName)
    {
        LastName = lastName;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String address)
    {
        Address = address;
    }

    public String getPhoneNumber()
    {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        PhoneNumber = phoneNumber;
    }

    public Calendar getDateAdded()
    {
        return DateAdded;
    }

    public void setDateAdded(Calendar dateAdded)
    {
        DateAdded = dateAdded;
    }
}
