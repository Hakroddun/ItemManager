package User.AddClient.usecases;

import User.entities.Client;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int insertClient(Client client)
    {
        return 0;
    }
}
