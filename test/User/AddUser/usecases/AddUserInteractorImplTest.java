package User.AddUser.usecases;

import User.entities.Group;
import User.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddUserInteractorImplTest
{
    private AddUserInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new AddUserInteractorImpl();
    }

    @Test
    public void AddNewUserSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        User user = new User();
        Assert.assertEquals(interactor.insertUser(user), interactor.USER_ADDITION_SUCCESS);
    }

    @Test
    public void AddNewUserFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        User user = new User();
        Assert.assertEquals(interactor.insertUser(user), interactor.USER_ADDITION_FAILURE);
    }

}