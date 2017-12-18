package User.AddItem.usecases;

import User.entities.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddItemInteractorImplTest
{
    private AddItemGroupInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new AddItemGroupInteractorImpl();
    }

    @Test
    public void AddNewItemSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Item item = new Item();
        Assert.assertEquals(interactor.AddItem(item), interactor.ITEM_ADDITION_SUCCESS);
    }

    @Test
    public void AddNewItemFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Item item = new Item();
        Assert.assertEquals(interactor.AddItem(item), interactor.ITEM_ADDITION_FAILURE);
    }

}