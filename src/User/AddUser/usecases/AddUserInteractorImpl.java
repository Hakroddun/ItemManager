package User.AddUser.usecases;

import User.entities.User;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddUserInteractorImpl implements AddUserInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String insertUser(User user)
    {
        int status = gateway.insertUser(user);
        if (status == 0)
        {
            return USER_ADDITION_SUCCESS;
        }
        else
        {
            return USER_ADDITION_FAILURE;
        }
    }
}
