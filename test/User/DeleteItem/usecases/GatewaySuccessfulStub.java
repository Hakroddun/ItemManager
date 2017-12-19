package User.DeleteItem.usecases;

import User.entities.Item;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int deleteItem(Item item)
    {
        return 0;
    }
}
