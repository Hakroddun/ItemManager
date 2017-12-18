package User.AddClient.usecases;

import User.entities.Client;

public class GatewayFailureStub implements GatewayInterface
{
    @Override
    public int insertClient(Client client)
    {
        return 1;
    }
}
