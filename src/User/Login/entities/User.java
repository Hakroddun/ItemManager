package User.Login.entities;

import java.util.Calendar;

/**
 * Created by gideon on 7/13/2017.
 */
public class User
{
    private String Name;
    private int AccessLevel;
    private Calendar LastLoginDate;

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        this.Name = name;
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
}
