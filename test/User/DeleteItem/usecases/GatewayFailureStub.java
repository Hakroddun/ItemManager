package User.DeleteItem.usecases;

import User.DeleteItem.usecases.GatewayInterface;
import User.entities.Item;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int deleteItem(Item item)
    {
        return 1;
    }
}
