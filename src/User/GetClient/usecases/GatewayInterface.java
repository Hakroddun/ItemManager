package User.GetClient.usecases;

import User.entities.Client;

import java.util.ArrayList;

/**
 * Created by gideon on 7/28/2017.
 */
public interface GatewayInterface
{
    Client getClient(int id);
    ArrayList<Client> getAllClients();
}
