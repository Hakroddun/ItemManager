package User.DeleteClient.usecases;

import User.entities.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteClientInteractorImplTest
{
    private DeleteClientInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new DeleteClientInteractorImpl();
    }

    @Test
    public void DeleteClientSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Client client = new Client();
        Assert.assertEquals(interactor.deleteClient(client), interactor.CLIENT_DELETION_SUCCESS);
    }

    @Test
    public void DeleteClientFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Client client = new Client();
        Assert.assertEquals(interactor.deleteClient(client), interactor.CLIENT_DELETION_FAILURE);
    }

}