package User.UpdateClient.usecases;

import User.entities.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateClientInteractorImplTest
{
    private UpdateClientInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new UpdateClientInteractorImpl();
    }

    @Test
    public void UpdateClientSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Client client = new Client();
        Assert.assertEquals(interactor.updateClient(client), interactor.CLIENT_UPDATE_SUCCESS);
    }

    @Test
    public void UpdateClientFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Client client = new Client();
        Assert.assertEquals(interactor.updateClient(client), interactor.CLIENT_UPDATE_FAILURE);
    }

}