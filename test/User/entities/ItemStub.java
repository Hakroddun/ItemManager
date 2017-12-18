package User.entities;

import User.entities.Item;

public class ItemStub extends Item
{
    private static final Integer Item_ID = 1;
    private static final String Item_Name = "TestName";
    private static final Double Item_Quantity = 10.0;
    private static final Double Item_Price = 100.0;

    public int getItem_ID() {
        return Item_ID;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public Double getItem_Quantity() {
        return Item_Quantity;
    }

    public Double getItem_Price() {
        return Item_Price;
    }
}
