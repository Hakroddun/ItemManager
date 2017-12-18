package User.AddItem.usecases;

import User.entities.Item;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int insertItem(Item item)
    {
        return 1;
    }
}
