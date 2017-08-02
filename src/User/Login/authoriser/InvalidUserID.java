package User.Login.authoriser;

/**
 * Created by gideon on 7/13/2017.
 */
public class InvalidUserID extends UserID
{
    InvalidUserID()
    {
        super(-1);
    }

    public boolean isValid()
    {
        return false;
    }
}
