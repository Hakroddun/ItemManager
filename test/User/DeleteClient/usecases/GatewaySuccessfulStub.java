package User.DeleteClient.usecases;

import User.entities.Client;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int deleteClient(Client client)
    {
        return 0;
    }
}
