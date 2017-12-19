package User.UpdateClient.usecases;

import User.entities.Client;

public class GatewaySuccessfulStub implements GatewayInterface
{
    @Override
    public int updateClient(Client client)
    {
        return 0;
    }
}
