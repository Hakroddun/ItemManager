package User.UpdateUser.usecases;

import User.entities.User;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateUserInteractorImpl implements UpdateUserInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String updateUser(User user)
    {
        int status = gateway.updateUser(user);
        if (status == 0)
        {
            return USER_UPDATE_SUCCESS;
        }
        else
        {
            return USER_UPDATE_FAILURE;
        }
    }
}
