package User.UpdateUser.usecases;

import User.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateUserInteractorImplTest
{
    private UpdateUserInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new UpdateUserInteractorImpl();
    }

    @Test
    public void UpdateUserSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        User user = new User();
        Assert.assertEquals(interactor.updateUser(user), interactor.USER_UPDATE_SUCCESS);
    }

    @Test
    public void UpdateUserFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        User user = new User();
        Assert.assertEquals(interactor.updateUser(user), interactor.USER_UPDATE_FAILURE);
    }

}