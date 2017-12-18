package User.Login.usecases;

import User.Login.authoriser.Authoriser;
import User.Login.authoriser.UserID;
import User.entities.User;

/**
 * Created by gideon on 7/13/2017.
 */
public class LoginInteractorImpl implements LoginInteractor
{
    private Authoriser authoriser;
    private LoginPresenter presenter;
    private GatewayInterface gateway;
    private LoginResponse response;
    private User user;

    void setAuthorizer(Authoriser authoriser)
    {
        this.authoriser = authoriser;
    }

    void setPresenter(LoginPresenter presenter)
    {
        this.presenter = presenter;
    }

    void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    private void PopulateUserResponse()
    {
        response.Name = user.getUserName();
        response.AccessLevel = user.getAccessLevel();
        response.LastLogin = user.getLastLoginDate();
    }

    public void Login(LoginRequest User)
    {
        response = new LoginResponse();
        UserID userID = authoriser.Autherise(User.username, User.password);

        if (userID.isValid())
        {
            user = gateway.getUser(userID);
            PopulateUserResponse();
        }
        else
        {
            response.AccessLevel = 0;
        }
        presenter.presentResponse(response);
    }

}
