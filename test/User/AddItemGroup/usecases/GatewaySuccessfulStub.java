package User.AddItemGroup.usecases;

import User.AddItemGroup.usecases.GatewayInterface;
import User.entities.Group;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int insertItemGroup(Group itemGroup)
    {
        return 0;
    }
}
