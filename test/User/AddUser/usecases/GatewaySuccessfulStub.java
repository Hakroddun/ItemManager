package User.AddUser.usecases;

import User.entities.User;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int insertUser(User user)
    {
        return 0;
    }
}
