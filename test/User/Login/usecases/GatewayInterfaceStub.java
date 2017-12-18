package User.Login.usecases;

import User.Login.authoriser.UserID;
import User.entities.User;
import User.entities.UserStub;

/**
 * Created by gideon on 7/26/2017.
 */
public class GatewayInterfaceStub implements GatewayInterface
{
    @Override
    public User getUser(UserID id)
    {
        return new UserStub();
    }
}
