package User.DeleteUser.usecases;

import User.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteUserInteractorImplTest
{
    private DeleteUserInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new DeleteUserInteractorImpl();
    }

    @Test
    public void DeleteUserSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        User user = new User();
        Assert.assertEquals(interactor.deleteUser(user), interactor.USER_DELETION_SUCCESS);
    }

    @Test
    public void DeleteUserFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        User user = new User();
        Assert.assertEquals(interactor.deleteUser(user), interactor.USER_DELETION_FAILURE);
    }

}