package User.AddClient.usecases;

import User.entities.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddClientInteractorImplTest
{
    private AddClientInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new AddClientInteractorImpl();
    }

    @Test
    public void AddNewClientSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Client client = new Client();
        Assert.assertEquals(interactor.insertClient(client), interactor.CLIENT_ADDITION_SUCCESS);
    }

    @Test
    public void AddNewClientFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Client client = new Client();
        Assert.assertEquals(interactor.insertClient(client), interactor.CLIENT_ADDITION_FAILURE);
    }

}