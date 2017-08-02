package User.Login.authoriser;

/**
 * Created by gideon on 7/13/2017.
 */
public class ValidAuthoriserStub implements Authoriser
{
    @Override
    public UserID Autherise(String username, String password)
    {
        return new UserID(1);
    }
}
