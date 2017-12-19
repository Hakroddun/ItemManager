package User.UpdateClient.usecases;

import User.entities.Client;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int updateClient(Client client)
    {
        return 1;
    }
}
