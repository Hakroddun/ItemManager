package User.AddItem.usecases;

import User.entities.Item;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddItemInteractorImpl implements AddItemInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String insertItem(Item item)
    {
        int status = gateway.insertItem(item);
        if (status == 0)
        {
            return ITEM_ADDITION_SUCCESS;
        }
        else
        {
            return ITEM_ADDITION_FAILURE;
        }
    }
}
