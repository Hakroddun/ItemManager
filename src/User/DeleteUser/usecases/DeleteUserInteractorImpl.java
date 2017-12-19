package User.DeleteUser.usecases;

import User.entities.User;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteUserInteractorImpl implements DeleteUserInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String deleteUser(User user)
    {
        int status = gateway.deleteUser(user);
        if (status == 0)
        {
            return USER_DELETION_SUCCESS;
        }
        else
        {
            return USER_DELETION_FAILURE;
        }
    }
}
