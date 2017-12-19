package User.DeleteClient.usecases;

import User.entities.Client;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteClientInteractorImpl implements DeleteClientInteractor
{
    private GatewayInterface gateway;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    String deleteClient(Client client)
    {
        int status = gateway.deleteClient(client);
        if (status == 0)
        {
            return CLIENT_DELETION_SUCCESS;
        }
        else
        {
            return CLIENT_DELETION_FAILURE;
        }
    }
}
