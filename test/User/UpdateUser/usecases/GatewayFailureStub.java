package User.UpdateUser.usecases;

import User.entities.User;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int updateUser(User user)
    {
        return 1;
    }
}
