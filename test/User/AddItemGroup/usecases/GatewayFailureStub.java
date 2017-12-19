package User.AddItemGroup.usecases;

import User.entities.Group;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int insertItemGroup(Group itemGroup)
    {
        return 1;
    }
}
