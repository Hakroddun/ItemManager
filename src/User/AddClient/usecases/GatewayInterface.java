package User.AddClient.usecases;

import User.entities.Client;

/**
 * Created by gideon on 7/28/2017.
 */
public interface GatewayInterface
{
    int insertClient(Client client);
}
