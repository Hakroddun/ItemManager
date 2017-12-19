package User.DeleteItemGroup.usecases;

import User.entities.Group;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteItemGroupInteractorImpl implements DeleteItemGroupInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String deleteGroup(Group itemGroup)
    {
        int status = gateway.deleteItemGroup(itemGroup);
        if (status == 0)
        {
            return GROUP_DELETION_SUCCESS;
        }
        else
        {
            return GROUP_DELETION_FAILURE;
        }
    }
}
