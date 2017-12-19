package User.UpdateUser.usecases;

import User.UpdateUser.usecases.GatewayInterface;
import User.entities.User;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int updateUser(User user)
    {
        return 0;
    }
}
