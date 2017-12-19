package User.UpdateItem.usecases;

import User.entities.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class UpdateItemInteractorImplTest
{
    private UpdateItemInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new UpdateItemInteractorImpl();
    }

    @Test
    public void UpdateItemSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Item item = new Item();
        Assert.assertEquals(interactor.updateItem(item), interactor.ITEM_UPDATE_SUCCESS);
    }

    @Test
    public void UpdateItemFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Item item = new Item();
        Assert.assertEquals(interactor.updateItem(item), interactor.ITEM_UPDATE_FAILURE);
    }

}