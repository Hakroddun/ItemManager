package User.Login.usecases;

/**
 * Created by gideon on 7/27/2017.
 */
public class LoginPresenterSpy implements LoginPresenter
{
    private LoginResponse InvokedResponse;
    @Override
    public void presentResponse(LoginResponse response)
    {
        InvokedResponse = response;
    }

    LoginResponse getInvokedResponse()
    {
        return InvokedResponse;
    }
}
