package User.UpdateItemGroup.usecases;

import User.entities.Group;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateItemGroupInteractorImpl implements UpdateItemGroupInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String updateGroup(Group itemGroup)
    {
        int status = gateway.updateItemGroup(itemGroup);
        if (status == 0)
        {
            return GROUP_UPDATE_SUCCESS;
        }
        else
        {
            return GROUP_UPDATE_FAILURE;
        }
    }
}
