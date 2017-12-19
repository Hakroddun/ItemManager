package User.DeleteClient.usecases;

import User.DeleteClient.usecases.GatewayInterface;
import User.entities.Client;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int deleteClient(Client client)
    {
        return 1;
    }
}
