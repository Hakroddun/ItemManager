package User.DeleteClient.usecases;

import User.entities.Client;

/**
 * Created by gideon on 7/28/2017.
 */
public interface GatewayInterface
{
    int deleteClient(Client client);
}
