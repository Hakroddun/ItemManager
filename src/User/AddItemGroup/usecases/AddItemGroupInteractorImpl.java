package User.AddItemGroup.usecases;

import User.entities.Group;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddItemGroupInteractorImpl implements AddItemGroupInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String insertGroup(Group itemGroup)
    {
        int status = gateway.insertItemGroup(itemGroup);
        if (status == 0)
        {
            return GROUP_ADDITION_SUCCESS;
        }
        else
        {
            return GROUP_ADDITION_FAILURE;
        }
    }
}
