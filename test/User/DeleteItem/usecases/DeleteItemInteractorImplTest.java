package User.DeleteItem.usecases;

import User.DeleteItem.usecases.DeleteItemInteractorImpl;
import User.entities.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gideon on 7/28/2017.
 */
public class DeleteItemInteractorImplTest
{
    private DeleteItemInteractorImpl interactor;
    @Before
    public void setUp()
    {
        interactor = new DeleteItemInteractorImpl();
    }

    @Test
    public void DeleteItemSuccess()
    {
        GatewaySuccessfulStub gateway = new GatewaySuccessfulStub();
        interactor.setGateway(gateway);
        Item item = new Item();
        Assert.assertEquals(interactor.deleteItem(item), interactor.ITEM_DELETION_SUCCESS);
    }

    @Test
    public void DeleteItemFail()
    {
        GatewayFailureStub gateway = new GatewayFailureStub();
        interactor.setGateway(gateway);
        Item item = new Item();
        Assert.assertEquals(interactor.deleteItem(item), interactor.ITEM_DELETION_FAILURE);
    }

}