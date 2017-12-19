package User.UpdateItemGroup.usecases;

import User.entities.Group;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int updateItemGroup(Group itemGroup)
    {
        return 1;
    }
}
