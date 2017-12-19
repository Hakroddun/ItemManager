package User.UpdateItemGroup.usecases;

import User.entities.Group;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateItemGroupInteractorImplTest
{
    private UpdateItemGroupInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new UpdateItemGroupInteractorImpl();
    }

    @Test
    public void UpdateGroupSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Group group = new Group();
        Assert.assertEquals(interactor.updateGroup(group), interactor.GROUP_UPDATE_SUCCESS);
    }

    @Test
    public void UpdateGroupFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Group group = new Group();
        Assert.assertEquals(interactor.updateGroup(group), interactor.GROUP_UPDATE_FAILURE);
    }

}