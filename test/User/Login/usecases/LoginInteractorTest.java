package User.Login.usecases;

import User.Login.authoriser.InvalidAuthoriserStub;
import User.Login.authoriser.ValidAuthoriserStub;
import User.entities.UserStub;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by gideon on 7/12/2017.
 */
public class LoginInteractorTest
{
    private LoginInteractorImpl interactor;
    @Before
    public void setUp() {
        interactor = new LoginInteractorImpl();
    }

    @Test
    public void PassedLogin()
    {
        ValidAuthoriserStub authoriser = new ValidAuthoriserStub();
        GatewayInterfaceStub gateway = new GatewayInterfaceStub();
        LoginPresenterSpy presenter = new LoginPresenterSpy();

        interactor.setAuthorizer(authoriser);
        interactor.setGateway(gateway);
        interactor.setPresenter(presenter);

        LoginRequest user = new LoginRequest();
        user.username = "username";
        user.password = "password";
        interactor.Login(user);

        LoginResponse response = presenter.getInvokedResponse();

        assertThat(response.Name, CoreMatchers.is(UserStub.STUB_NAME));
        assertThat(response.LastLogin, is(UserStub.STUB_TIME));
        assertEquals(response.AccessLevel, UserStub.STUB_LOGIN_ACCESS_LEVEL);
    }

    @Test
    public void FailedLogin()
    {
        InvalidAuthoriserStub authoriser = new InvalidAuthoriserStub();
        GatewayInterfaceStub gateway = new GatewayInterfaceStub();
        LoginPresenterSpy presenter = new LoginPresenterSpy();
        interactor.setAuthorizer(authoriser);
        interactor.setGateway(gateway);
        interactor.setPresenter(presenter);

        LoginRequest user = new LoginRequest();
        user.username = "";
        user.password = "";
        interactor.Login(user);

        LoginResponse response = presenter.getInvokedResponse();
        assertEquals(response.AccessLevel, 0);
    }



}
