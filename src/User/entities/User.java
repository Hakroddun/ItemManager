package User.entities;

import java.util.Calendar;

public class User
{
    private int ID;
    private String UserName;
    private String FirstName;
    private String LastName;
    private int AccessLevel;
    private Calendar LastLoginDate;

    public String getUserName()
    {
        return UserName;
    }

    public void setUserName(String userName)
    {
        UserName = userName;
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

    public int getAccessLevel()
    {
        return AccessLevel;
    }

    public void setAccessLevel(int accessLevel)
    {
        AccessLevel = accessLevel;
    }

    public Calendar getLastLoginDate()
    {
        return LastLoginDate;
    }

    public void setLastLoginDate(Calendar lastLoginDate)
    {
        LastLoginDate = lastLoginDate;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }
}
