package User.DeleteItem.usecases;

import User.entities.Item;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteItemInteractorImpl implements DeleteItemInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String deleteItem(Item item)
    {
        int status = gateway.deleteItem(item);
        if (status == 0)
        {
            return ITEM_DELETION_SUCCESS;
        }
        else
        {
            return ITEM_DELETION_FAILURE;
        }
    }
}
