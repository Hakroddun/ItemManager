package User.Login.usecases;

import User.Login.authoriser.UserID;
import User.Login.entities.User;

/**
 * Created by gideon on 7/14/2017.
 */
public interface GatewayInterface
{
    User getUser(UserID id);
}
