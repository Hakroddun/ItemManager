package User.AddItem.usecases;

import User.entities.Item;

/**
 * Created by gideon on 7/28/2017.
 */
public interface GatewayInterface
{
    int insertItem(Item item);
}
