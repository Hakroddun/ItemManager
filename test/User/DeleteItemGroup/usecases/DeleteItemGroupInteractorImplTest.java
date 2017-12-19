package User.DeleteItemGroup.usecases;

import User.DeleteItemGroup.usecases.DeleteItemGroupInteractorImpl;
import User.entities.Group;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteItemGroupInteractorImplTest
{
    private DeleteItemGroupInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new DeleteItemGroupInteractorImpl();
    }

    @Test
    public void DeleteGroupSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Group group = new Group();
        Assert.assertEquals(interactor.deleteGroup(group), interactor.GROUP_DELETION_SUCCESS);
    }

    @Test
    public void DeleteGroupFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Group group = new Group();
        Assert.assertEquals(interactor.deleteGroup(group), interactor.GROUP_DELETION_FAILURE);
    }

}