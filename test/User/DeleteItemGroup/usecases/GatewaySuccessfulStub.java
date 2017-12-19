package User.DeleteItemGroup.usecases;

import User.DeleteItemGroup.usecases.GatewayInterface;
import User.entities.Group;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int deleteItemGroup(Group itemGroup)
    {
        return 0;
    }
}
