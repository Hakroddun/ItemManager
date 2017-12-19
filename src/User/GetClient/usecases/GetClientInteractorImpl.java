package User.GetClient.usecases;

import User.entities.Client;

/**
 * Created by gideon on 7/28/2017.
 */
public class GetClientInteractorImpl implements GetClientInteractor
{
    private GatewayInterface gateway;
    private ClientPresenter presenter;
    ClientResponse response;
    Client client;

    public void setGateway(GatewayInterface gateway)
    {
        this.gateway = gateway;
    }

    void setPresenter(ClientPresenter presenter)
    {
        this.presenter = presenter;
    }

    private void PopulateClientResponse()
    {
        response.ID = client.getID();
        response.FirstName = client.getFirstName();
        response.LastName = client.getLastName();
        response.Address = client.getAddress();
        response.PhoneNumber = client.getPhoneNumber();
        response.DateAdded = client.getDateAdded();
    }

    public void getClient(int clientID)
    {
        response = new ClientResponse();
        client = gateway.getClient(clientID);
        PopulateClientResponse();
        presenter.presentResponse(response);
    }
}
