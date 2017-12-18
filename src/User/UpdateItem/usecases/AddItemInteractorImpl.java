package User.UpdateItem.usecases;

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

    String updateItem(Item item)
    {
        int status = gateway.updateItem(item);
        if (status == 0)
        {
            return ITEM_UPDATE_SUCCESS;
        }
        else
        {
            return ITEM_UPDATE_FAILURE;
        }
    }
}
