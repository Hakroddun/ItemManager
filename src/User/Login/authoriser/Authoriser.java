package User.Login.authoriser;


/**
 * Created by gideon on 7/13/2017.
 */
public interface Authoriser
{
    UserID Autherise(String username, String password);
}
