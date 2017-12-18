package User.AddClient.usecases;

import User.entities.Client;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddClientInteractorImpl implements AddClientInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String insertClient(Client client)
    {
        int status = gateway.insertClient(client);
        if (status == 0)
        {
            return CLIENT_ADDITION_SUCCESS;
        }
        else
        {
            return CLIENT_ADDITION_FAILURE;
        }
    }
}
