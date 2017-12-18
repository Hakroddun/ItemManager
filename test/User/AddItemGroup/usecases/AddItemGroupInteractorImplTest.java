package User.AddItemGroup.usecases;

import User.entities.Group;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddItemGroupInteractorImplTest
{
    private AddItemGroupInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new AddItemGroupInteractorImpl();
    }

    @Test
    public void AddNewGroupSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Group group = new Group();
        Assert.assertEquals(interactor.insertGroup(group), interactor.GROUP_ADDITION_SUCCESS);
    }

    @Test
    public void AddNewGroupFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Group group = new Group();
        Assert.assertEquals(interactor.insertGroup(group), interactor.GROUP_ADDITION_FAILURE);
    }

}