package User.UpdateItem.usecases;

import User.UpdateItem.usecases.GatewayInterface;
import User.entities.Item;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int updateItem(Item item)
    {
        return 1;
    }
}
