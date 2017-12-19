package User.DeleteUser.usecases;

import User.entities.User;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int deleteUser(User user)
    {
        return 0;
    }
}
