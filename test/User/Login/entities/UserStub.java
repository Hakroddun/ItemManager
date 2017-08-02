package User.Login.entities;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by gideon on 7/19/2017.
 */
public class UserStub extends User
{
    public static final Calendar STUB_TIME =
            new GregorianCalendar(2013, 11, 13, 10, 31);
    public static final String STUB_NAME = "name stub";
    public static final int STUB_LOGIN_ACCESS_LEVEL = 1;

    public int getAccessLevel() {
        return STUB_LOGIN_ACCESS_LEVEL;
    }

    public Calendar getLastLoginDate() {
        return STUB_TIME;
    }

    public String getName() {
        return STUB_NAME;
    }
}
