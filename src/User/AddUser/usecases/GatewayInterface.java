package User.AddUser.usecases;

import User.entities.User;

/**
 * Created by gideon on 7/28/2017.
 */
public interface GatewayInterface
{
    int insertUser(User user);
}
