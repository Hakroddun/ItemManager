package User.AddItem.usecases;

import User.AddItem.entities.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gideon on 7/28/2017.
 */
public class AddItemInteractorTest
{
    private AddItemInteractor interactor;
    @Before
    public void setUp() throws Exception
    {
        interactor = new AddItemInteractor();
    }

    @Test
    public void AddNewItem()
    {
        Item item = new Item();
        Assert.assertEquals(interactor.AddItem(item), true);
    }

}