package User.UpdateClient.usecases;

import User.entities.Client;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateClientInteractorImpl implements UpdateClientInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String updateClient(Client client)
    {
        int status = gateway.updateClient(client);
        if (status == 0)
        {
            return CLIENT_UPDATE_SUCCESS;
        }
        else
        {
            return CLIENT_UPDATE_FAILURE;
        }
    }
}
