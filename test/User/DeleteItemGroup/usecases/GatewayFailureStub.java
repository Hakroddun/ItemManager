package User.DeleteItemGroup.usecases;

import User.entities.Group;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int deleteItemGroup(Group itemGroup)
    {
        return 1;
    }
}
