package lesson10.HW;

import java.util.Date;

public class FurnitureOrder extends Order {
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder(){
        if(getCustomerOwned() != null && (getShipFromCity() == "Киев") || (getShipFromCity() == "Львов")){
            if (getBasePrice() >= 500) {
                setDateConfirmed(new Date());
            }
        }
    }

    @Override
    public void calculatePrice(){
        double totalPrice = 0;
        if(getBasePrice() < 5000){
            totalPrice = getBasePrice() + getBasePrice()*0.05;
        }else
            totalPrice = getBasePrice() + getBasePrice()*0.02;

    }
}
