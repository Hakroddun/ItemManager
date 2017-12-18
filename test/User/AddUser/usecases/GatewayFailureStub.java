package User.AddUser.usecases;

import User.entities.User;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int insertUser(User user)
    {
        return 1;
    }
}
