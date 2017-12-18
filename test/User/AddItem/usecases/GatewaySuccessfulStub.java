package User.AddItem.usecases;

import User.entities.Item;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int insertItem(Item item)
    {
        return 0;
    }
}
