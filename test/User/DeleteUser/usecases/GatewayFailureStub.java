package User.DeleteUser.usecases;

import User.entities.User;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int deleteUser(User user)
    {
        return 1;
    }
}
