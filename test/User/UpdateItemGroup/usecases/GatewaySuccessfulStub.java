package User.UpdateItemGroup.usecases;

import User.entities.Group;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int updateItemGroup(Group itemGroup)
    {
        return 0;
    }
}
